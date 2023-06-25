package model;

public class Task {
    
    public static String TASK_DISPLAY_FORMAT = "%-5s%-15s%-15s%-15s%-15s%-15s%-15s";
    public static String TASK_DISPLAY_HEADER = String.format(TASK_DISPLAY_FORMAT, "Id", "Name", "Task type", "Date", "Time", "Assignee", "Reviewer");
    
    public enum typeTask {
        Code, Test, Design, Review;
        
        public static typeTask getTaskByIntValue(int i) {
            switch (i) {
                case 1:
                    return Code;
                case 2:
                    return Test;
                case 3:
                    return Design;
                case 4:
                    return Review;
                
            }
            throw new ArrayIndexOutOfBoundsException("Invalid value");
        }
    }
    
    private int id;
    private String name;
    
    private typeTask type;
    
    private String date;
    private double from;
    private double to;
    private String assignee;
    private String reviewer;
    
    public Task() {
        
    }
    
    public Task(int id, String name, int type, String date, double from, double to, String assignee, String reviewer) {
        
        this.id = id;
        this.name = name;
        this.date = date;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
        setTypeByIntValue(type);
        
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
    
    public void setTypeByIntValue(int type) {
        setType(typeTask.getTaskByIntValue(type));
    }
    
    public typeTask getType() {
        return type;
    }
    
    public void setType(typeTask t) {
        this.type = t;
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
    
    @Override
    public String toString() {
        String result = String.format(TASK_DISPLAY_FORMAT, id, name, getType(), date, getTo() - getFrom(), assignee, reviewer);
        return result;
    }
    
}
