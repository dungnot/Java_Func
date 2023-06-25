package utils;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doan7
 */
public class Validate {
    //Doan Khanh          
    static Scanner sc = new Scanner(System.in);
    public String getName(String mess, String err,String regex){
        Pattern p = Pattern.compile(regex);
        while (true) {            
            System.out.print(mess);
            String name = sc.nextLine();
            if(p.matcher(name).find()){
                return name.trim();
            }
            else{
                System.err.println(err);                
            }
        }
        
    }
    
    public int getInt(String mess,String err,int min, int max){       
        while(true){
            try {
                System.out.print(mess);
                int number = Integer.parseInt(sc.nextLine());
                if(number < min || number >max){
                    System.err.println(err);
                }else{
                   return number; 
                }
            } catch (Exception e) {
                System.err.println("invalid number pls input again!");
            }
        }               
    }
    
    public String taskType( int taskTypeId){
        String res = "";
        switch(taskTypeId){
            case 1: 
                res = "Code";
                break;
            case 2:
                res = "Test";
                break;
            case 3:
                res = "Design";
                break;
            case 4:
                res = "Review";
                break;
               
        }
        return res;
    }
    
    public String getDate(String mess,String err){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        while (true) {            
            try {
                System.out.print(mess); 
                sdf.setLenient(false);
                Date date = sdf.parse(sc.nextLine());
                return sdf.format(date);
            } catch (Exception e) {
                System.out.println(err);
            }
        }
        
    }
  
     public double getDouble(String mess,String err,double min, double max){       
        while(true){
            try {
                System.out.print(mess);
                double number = Double.parseDouble(sc.nextLine());
                if(number < min || number >max){
                    System.err.println(err);
                }else{
                   return number; 
                }
            } catch (Exception e) {
                System.err.println("invalid number pls input again!");
            }
        }               
    }
    
}
