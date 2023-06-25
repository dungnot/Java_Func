/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author Dũng
 */
public class StudentDAO extends DBContext {

    public ArrayList<Student> getAllStudent() {
        ArrayList<Student> list = new ArrayList<>();
        try {
            String sql = "Select * from Student";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getDate(4), rs.getInt(5));
                list.add(student);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Student> getAllStudentByClassID(String ClassId) {
        ArrayList<Student> list = new ArrayList<>();
        try {
            String sql = "Select * from Student where id_class = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, ClassId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getDate(4), rs.getInt(5));
                list.add(student);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public ArrayList<Student> filterStudent(String name, String gender, String classId) {
        ArrayList<Student> list = new ArrayList<>();
        try {
            String sql = "Select * from Student \n"
                    + " where lower([name]) like ? ";
            if (!gender.isEmpty()) {
                sql = sql + " and gender = " + gender;
            }
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%" + name + "%");
            stm.setString(2, gender);
//            stm.setString(3, classId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getDate(4), rs.getInt(5));
                list.add(student);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    // get danh sách
    public ArrayList<Student> getStudentByNameAndDob(String name, String dob) {
        //khai báo biến để lưu trữ dự liệu
        ArrayList<Student> list = new ArrayList<>();
        // chuẩn bị câu sql
        String sql = "select * from Student \n"
                + "where [name] like ? and dob = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql); // *
            stm.setString(1, "%" + name + "%");  // name là kiểu string nên setString , bắt đầu là 1 nếu có thêm and id,bla bla thì câu set tiếp theo là 2, 3, ..., "%" + name + "%" thay thế cho dấu ? ở trên trong câu lệnh sql là '%nh%'
            // dòng 85 trong "%" + name + "%" không cần ' ' như '%nh%' vì nó đã tự thêm ngầm trong "%"
            stm.setString(2, dob);
            ResultSet rs = stm.executeQuery(); // *
            while (rs.next()) {
                // bước get dữ liệu ra và set vào biến java
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getDate(4), rs.getInt(5));
                list.add(student);
            }
            // trả về dữ liệu
            return list;
        } catch (Exception e) {
            e.getStackTrace();
            return null;
        }

    }

    // get đối tượng
    public Student getStudentById(String id) {
        //khai báo biến để lưu trữ dự liệu
         
        // chuẩn bị câu sql
        String sql = "select * from Student \n"
                + "where id = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql); // *
            stm.setString(1, id);
            ResultSet rs = stm.executeQuery(); // *
            while (rs.next()) {
                // bước get dữ liệu ra và set vào biến java
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getDate(4), rs.getInt(5));
                return student;
            }

        } catch (Exception e) {
            e.getStackTrace();
            
        } 
        // trả về dữ liệu
           return null;
    }
    // insert và update, delete

}
