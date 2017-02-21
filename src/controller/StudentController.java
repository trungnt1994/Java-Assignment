/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.StudentModel;
import Util.ScannerUtil;
import entity.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentController {

    public static void processInsert(){
        System.out.println("Nhap ma sinh vien:");
        int id = ScannerUtil.getInt();
        System.out.println("Nhap ten sinh vien:");
        String name = ScannerUtil.getString();
        System.out.println("Nhap lop:");
        String classes = ScannerUtil.getString();        
        Student st = new Student();
        st.setId(id);
        st.setName(name);
        st.setClasses(classes);
        StudentModel.insert(st);
    }

    public static void getList() {
        try {
            ResultSet rs = StudentModel.list();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String classes = rs.getString("classes");
                System.out.println("Ma sinh vien : " + id);
                System.out.println("Ten sinh vien: " + name);
                System.out.println("Lop : " + classes);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public static void processUpdate(){
        System.out.println("Nhap ma sinh vien:");
        int id = ScannerUtil.getInt();
        System.out.println("Nhap ten sinh vien:");
        String name = ScannerUtil.getString();
        System.out.println("Nhap lop:");
        String classes = ScannerUtil.getString();        
        Student st = new Student();
        st.setId(id);
        st.setName(name);
        st.setClasses(classes);
        StudentModel.update(st);
    }
    
    public static void processDelete(){
        System.out.println("Nhap ma sinh vien:");
        int id = ScannerUtil.getInt();
        Student st = new Student();
        st.setId(id);
        StudentModel.delete(st);
    }
    
    public static void processQuery(){
        System.out.println("Nhap ma sinh vien:");
        int id = ScannerUtil.getInt();
        Student st = new Student();
        st.setId(id);
        StudentModel.query(st);
    }
}
