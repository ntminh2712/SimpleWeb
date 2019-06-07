package simpleweb.model;

import simpleweb.entity.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class StudentModel {
    private static ArrayList<Student> list = new ArrayList<Student>();

    public Student findByUsernameAndPassword(String username, String password) {
        try {
            String sqlCommand = "select * from studens where username = ? and password = ?";
            PreparedStatement preparedStatement = ConnectionHelper.getConnection().prepareStatement(sqlCommand);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String rsUsername = resultSet.getString(1);
                String rsPassword = resultSet.getString(2);
                String rsFullname = resultSet.getString(3);
                String rsEmail = resultSet.getString(4);
                String rsPhone = resultSet.getString(4);
                String rsAddress = resultSet.getString(4);
                Student existStudents = new Student();
                existStudents.setUsername(rsUsername);
                existStudents.setPassword(rsPassword);
                existStudents.setFullName(rsFullname);
                existStudents.setEmail(rsEmail);
                existStudents.setPhone(rsPhone);
                existStudents.setAddress(rsAddress);
                return existStudents;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }


    public ArrayList<Student> getList(){
        ArrayList<Student> results = new ArrayList<Student>();
        try {
            String sqlCommand = "select * from students";
            PreparedStatement preparedStatement = ConnectionHelper.getConnection().prepareStatement(sqlCommand);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String fullname = resultSet.getString("fullname");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String address = resultSet.getString("address");
                Student student = new Student();
                student.setUsername(username);
                student.setPassword(password);
                student.setFullName(fullname);
                student.setEmail(email);
                student.setPhone(phone);
                student.setAddress(address);
                results.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }

    public boolean save(Student student) {
        try {
            String sqlCommand = "insert into students (username, password, email, fullname,phone, address) values (?,?,?,?,?,?)";
            PreparedStatement preparedStatement = ConnectionHelper.getConnection().prepareStatement(sqlCommand);
            preparedStatement.setString(1, student.getUsername());
            preparedStatement.setString(2, student.getPassword());
            preparedStatement.setString(3, student.getFullName());
            preparedStatement.setString(4, student.getEmail());
            preparedStatement.setString(5,student.getPhone());
            preparedStatement.setString(6, student.getAddress());
            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
