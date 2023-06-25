package utils;


import controller.Controller;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doan7
 */
public class view {
    static Scanner sc = new Scanner(System.in);
    Validate validate = new Validate();
    Controller c = new Controller();
    public void menu(){
        System.out.println("========== Task Program =========");
        System.out.println("1.Add Task");
        System.out.println("2.Delete Task");
        System.out.println("3.Display");
        System.out.println("4.Exit");
    }
    
    public void add(){
        String name = validate.getName("Enter requirement name:", "invalid Name pls Input again!", "^[a-zA-Z ]+$");
        int TaskType = validate.getInt("Enter the Task Type Id: ", "Pls input number in range [1,4]", 1, 4);
        String date = validate.getDate("Enter date: ", "Invalid date Pls input again !");
        double from = validate.getDouble("Enter From: ", "Pls input number in range [8.0,17.5]", 8.0, 17.5);
        double to = validate.getDouble("Enter To: ", "Pls input number in range [8.0,17.5]", 8.0, 17.5);
        String assignee = validate.getName("Enter assignee: ", "Invalid assignee pls input again!", "^[a-zA-Z ]+$");
        String reviewer = validate.getName("Enter reviewer: ", "Invalid reviewer pls input again!", "^[a-zA-Z ]+$");
        c.add(name, TaskType, from, to, date, assignee, reviewer);
        System.out.println("Add successfull!");
    }
    
    public void delete(){
        int id = validate.getInt("Enter the id: ", "", Integer.MIN_VALUE, Integer.MAX_VALUE);
        c.delete(id);
    }
    
    public void display(){
        c.display();
    }
    
    
}
