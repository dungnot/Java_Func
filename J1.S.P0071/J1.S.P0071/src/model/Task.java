package model;


import java.util.Date;
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
public class Task {
    private int id;
    private String name;
    private int typeTask;
    private String date;
    private double from;
    private double to;
    private String assignee;
    private String reviewer;

    public Task() {
    }

    public Task(int id, String name, int typeTask, String date, double from, double to, String assignee, String reviewer) {
        this.id = id;
        this.name = name;
        this.typeTask = typeTask;
        this.date = date;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeTask() {
        return typeTask;
    }

    public void setTypeTask(int typeTask) {
        this.typeTask = typeTask;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
    Validate v = new Validate();
   @Override
    public String toString() {
        String result = String.format("%-5d%-15s%-15s%-15s%-15.1f%-15s%-15s",id,name,v.taskType(typeTask),date,getTo()-getFrom(),assignee,reviewer);
        return result;
    }
    
    
    
}
