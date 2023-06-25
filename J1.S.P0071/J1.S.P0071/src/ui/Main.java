package ui;



import utils.view;
import java.util.Scanner;
import utils.Validate;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author doan7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Validate validate = new Validate();
        view v = new view();
        while (true) {
            v.menu();            
            int choice = validate.getInt("Enter your choice: ", "Pls input number in range [1,4]", 1, 4) ;
            switch(choice){
                case 1: 
                    v.add();
                    break;
                case 2:
                    v.delete();
                    break;
                case 3:
                    v.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                    
            }
        }
        
        
    }

}
