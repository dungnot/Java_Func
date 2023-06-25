/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Classes;

/**
 *
 * @author Dũng
 */
public class ClassesDAO extends DBContext{
    public ArrayList<Classes> getAllClasses(){
        ArrayList<Classes> list = new ArrayList<>();
        String sql = "Select * from Class";
        try{
            PreparedStatement statement = connection.prepareStatement(sql);  // chuẩn bị câu sql để chạy
            ResultSet rs = statement.executeQuery();    // tương ứng như ấn excute bên sql , trả về rs và resultSet là bao gồm tất cả data mà mình truy vấn
            while (rs.next()) {                 
                Classes classes = new Classes(rs.getInt(1),rs.getString(2),rs.getString(3));  // lấy dữ liệu theo cột
                list.add(classes);
            }
            return list;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
