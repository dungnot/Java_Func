/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0074;

import java.util.Scanner;

/**
 *
 * @author doan7
 */
public class J1SP0074 {

   public static void main(String[] args) {
        // TODO code application logic here
         Validate v = new Validate();
                  
            while(true){
                v.printMenu();
            int choice = v.getChoice();
            switch(choice){
                case 1:
                    v.add();
                    break;
                case 2:
                    v.sub();
                    break;
                case 3:
                    v.multi();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
            }
        
    }
    
    
}
