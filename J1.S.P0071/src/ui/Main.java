package ui;

import bo.TaskManagement;
import controller.Controller;
import utils.View;
import java.util.Scanner;
import model.Task;
import utils.Validate;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Validate validate = new Validate();
        Controller c = new Controller();
        
        View v = new View();
        while (true) {
            v.menu();
            int choice = validate.getInt("Enter your choice: ", "Pls input number in range [1,4]", 1, 4);
            switch (choice) {
                case 1:
                    if (c.add()) {
                        System.out.println("Add Successfull!");
                    } else {
                        System.out.println("Add Fail!");
                    }
                    
                    break;
                case 2:
                    try {
                        Task deleted = c.delete();
                        System.out.println("Delete successful!");
                        Controller.displayTask(deleted);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Delete fail");
                    }
                    break;
                case 3:
                    c.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                
            }
        }
        
    }
    
}
