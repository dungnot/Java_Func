package bo;

import model.Task;
import utils.Validate;

public class TaskInputer {

    private Task t;
    private Validate validate;

    public TaskInputer() {
        t = new Task();
        validate = new Validate();
    }

    public Task inputTaskInfomation() {

        String name = validate.getStringByRegex("Enter requirement name:", "invalid Name pls Input again!", "^[a-zA-Z ]+$");
        int taskType = validate.getInt("Enter the Task Type Id: ", "Pls input ID in range [1,4]", 1, 4);
        String date = validate.getDate("Enter date: ", "Invalid date Pls input again !");
        double from = 0;
        double to = 0;
        from = validate.getDouble("Enter From: ", "Pls input number in range [8.0,17.5]", 8.0, 17.5);
        to = validate.getDouble("Enter To: ", "Pls input number in range [" + from + ",17.5]", from, 17.5);

        String assignee = validate.getStringByRegex("Enter assignee: ", "Invalid assignee pls input again!", "^[a-zA-Z1-9 ]+$");
        String reviewer = validate.getStringByRegex("Enter reviewer: ", "Invalid reviewer pls input again!", "^[a-zA-Z1-9 ]+$");
        t = new Task(0, name, taskType, date, from, to, assignee, reviewer);
        return getTask();
    }

    public Task getTask() {
        return t;
    }

}
