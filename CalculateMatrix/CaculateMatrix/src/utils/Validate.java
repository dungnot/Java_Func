/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author AMIN
 */
import java.util.Scanner;


public class Validate {

    public static int getSize(String mess) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mess);
        int number = 0;
        while (true) {
            try {
                number = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Values of matrix must be the number ");
                System.out.print(mess);
            } catch (IndexOutOfBoundsException m) {
                System.out.println("Values of matrix must be the number ");
                System.out.println(mess);
            }
        }
        return number;
    }

   

    /// 
    public static int getChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Choice:");
        int choice = 0;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= 4) {
                    break;
                } else {
                    System.out.println("Choice from 1 to 4 :");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid ");
            }
        }
        return choice;
    }
  

}
