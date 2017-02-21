/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import entity.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentModel {
    
    public static ResultSet list(){
        String sql = "SELECT * FROM student ";
        try {
            Statement stt = DAO.getConnection().createStatement();
            return stt.executeQuery(sql);
             
        } catch (SQLException e) {
            System.err.println("Khong the hien thi !!!");
        }
        return null;
    }
      
    public static void insert(Student student){        
        try{
        Statement stt = DAO.getConnection().createStatement();
        stt.execute("INSERT INTO student VALUES ('"+student.getId()+"','"
                                                   +student.getName()+"','"
                                                   +student.getClasses()+"')");
        }catch (SQLException e){            
            System.out.print("Them moi khong thanh cong");
        }        
    }
    
    public static void update(Student student) {
        try {
            Statement stt = DAO.getConnection().createStatement();            
            stt.execute("UPDATE INTO student SET (name = '"+student.getName()+"',classes = '"+student.getClasses()+"') WHERE id = '"+student.getId()+"',");
        } catch (SQLException ex) {
            System.out.print("Sua thong tin khong thanh cong");
        }
    }
    
    public static void delete(Student student) {
        try {
            Statement stt = DAO.getConnection().createStatement();        
            stt.execute("DELETE * FROM student WHERE id = '"+student.getId()+"',");
        } catch (SQLException ex) {
            System.out.print("Xoa thong tin khong thanh cong");
        }
    }
    
    public static void query(Student student) {
        try {
            Statement stt = DAO.getConnection().createStatement();        
            stt.execute("SELECT * FROM student WHERE id = '"+student.getId()+"',");
        } catch (SQLException ex) {
            System.out.print("Tim kiem khong thanh cong");
        }
    }
}
