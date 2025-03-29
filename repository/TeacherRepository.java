package org.example.repository;

import org.example.model.Student;
import org.example.repository.impl.TeacherRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TeacherRepository implements TeacherRepositoryImpl {

    private static final String deleteMessage = "you have successfully deleted";
    private static final String deletQuery = "delete from student";
    private static final String where_id="where id='";
    private static final String update_management_set="update management set ";
    private static final String updateMessage="You have successfully updated";
    private static final String readQuery="select * from management ";
    private static final String registerMessage="You have successfully registerd";
    private static final String registerQuery="insert into management values('";

    private static Statement databaseConnection(){
        Statement st = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/smartstart08";
            String user="root";
            String pass="ss08";
            Connection con = DriverManager.getConnection(url,user,pass);
            st= con.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
        return st;
    }

    @Override
    public String register(Student student) {
        String result = null;
        try{
            Statement st = databaseConnection();
            int count = st.executeUpdate(registerQuery+student.getRollNo()+"','"+student.getName()+"','"+student.getEmail()+"')");
            if(count>0){
                result=registerMessage;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return result;
    }

    @Override
    public Student readSingleStudent(int rollNo) {
        Student student=new Student();
        try {
            Statement st = databaseConnection();
            ResultSet rs=st.executeQuery(readQuery+where_id+rollNo+"'");
            while(rs.next()){
                student.setRollNo(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setEmail(rs.getString(3));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return student;
    }
    @Override
     public List<Student> readAllStudent() {
        List<Student> studentList = new ArrayList<>();
        try {
            Statement st = databaseConnection();
            ResultSet rs = st.executeQuery(readQuery);
            while (rs.next()) {
                Student student=new Student();
                student.setRollNo(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setEmail(rs.getString(3));
                studentList.add(student);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return studentList;
    }

    @Override
    public String updateSingleStudent(Student students) {
        String result = null;
        try {
            Statement st = databaseConnection();
            int count=0;
            if (students.getName()!=null&&students.getEmail()!=null){
                count=st.executeUpdate(update_management_set+students.getName()+"',email='"+students.getEmail()+where_id+students.getRollNo()+"'");
            }
            else{
                if (students.getName()!=null&&students.getEmail()==null){
                    count=st.executeUpdate(update_management_set+students.getName()+where_id+students.getRollNo()+"'");
                }
                else {
                    count=st.executeUpdate(update_management_set+students.getEmail()+where_id+students.getRollNo()+"'");
                }

            }
            if (count>0) {
                result = "you have successfully updated";
            }

        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }

    @Override
    public String deleteSingleStudent(int rollNo) {
        String result = null;
        try{
            Statement st= databaseConnection();
            int count = st.executeUpdate(deletQuery+" where rollNo='"+rollNo+"'");
            if(count>0){
                result=deleteMessage;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return result;

    }

    @Override
    public String deleteAllStudent() {
        String result = null;
        try{
            Statement st= databaseConnection();
            int count = st.executeUpdate(deletQuery);
            if(count>0){
                result=deleteMessage;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return result;
    }


}