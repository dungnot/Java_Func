package controller;


import model.Task;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doan7
 */
public class Controller {
    List<Task> tasks = new ArrayList<>();

    public Controller() {
        tasks.add(new Task(1, "Dev Program", 1, "12-03-2009", 4, 8, "dev", "lead"));
    }
        
    
    public void add(String name, int typeID, double from, double to,String date, String assignee, String reviewer){
        int id = 1;
        
        if(!tasks.isEmpty()){
            id = tasks.get(tasks.size()-1).getId() +1;           
        }
       
         Task t = new Task(id, name, typeID, date, from, to, assignee, reviewer);
        tasks.add(t);
   
    }
    
    public void delete(int id){
        boolean checkExist = false;
        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).getId() == id){
                tasks.remove(i);
                checkExist = true;
                System.out.println("Delete successfuly!");
            }
        }
        
        if (!checkExist) {
            System.out.println("Delete Fail!");
        }
    }
    
    public  void display(){
         System.out.println("------------------------------Task------------------------------");
            System.out.format("%-5s%-15s%-15s%-15s%-15s%-15s%-15s","Id","Name","Task type","Date","Time","Assignee","Reviewer");
            System.out.println("");
            for (Task task : tasks) {
                System.out.println(task.toString());
    }
    }
    
    
}
