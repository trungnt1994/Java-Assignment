/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Util.ScannerUtil;
import controller.StudentController;

public class Menu {
    public static void main(String[] args) {
        printMenu();
    }   

    static void printMenu() {
        while (true) {
            int choice;
            System.out.println("==============================");
            System.out.println("| Phần mềm quản lý sinh viên |");
            System.out.println("==============================");
            System.out.println("| Lựa chọn:                  |");
            System.out.println("|        1. Danh sách.       |");
            System.out.println("|        2. Thêm mới.        |");
            System.out.println("|        3. Sửa thông tin.   |");
            System.out.println("|        4. Xoá.             |");
            System.out.println("|        5. Tìm kiếm.        |");
            System.out.println("|        6. Exit             |");
            System.out.println("==============================");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = ScannerUtil.getInt();
            switch (choice) {
                case 1:
                    System.out.println("Hiển thị danh sách sinh viên.");
                    StudentController.getList();
                    break;
                case 2:
                    StudentController.processInsert();
                    break;
                case 3:
                    System.out.println("Sửa thông tin sinh viên.");
                    StudentController.processUpdate();
                    break;
                case 4:
                    System.out.println("Xoá sinh viên.");
                    StudentController.processDelete();
                    break;
                case 5:
                    System.out.println("Tìm kiếm sinh viên.");
                    StudentController.processQuery();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn sai. Vui lòng lựa chọn trong khoảng từ 1 đến 6.");
                    break;
            }
            if (choice == 6) {
                break;
            }
        }
    }
}
