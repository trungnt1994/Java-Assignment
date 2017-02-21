/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Scanner;

public class ScannerUtil {
   public static int getInt() {
        int inputInt = 0;
        while (true) {
            try {
                inputInt = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Chi co the nhap so: ");
            }
        }
        return inputInt;
    }

    public static String getString() {
        String inputString = "";
        while (true) {
            try {
                inputString = new Scanner(System.in).nextLine();
                if (inputString.length() > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Chi co the nhap chu: ");
            }
        }
        return inputString;
    }
}
