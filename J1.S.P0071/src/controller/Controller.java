package controller;

import bo.TaskInputer;
import bo.TaskManagement;
import model.Task;
import utils.Validate;

public class Controller {

    private TaskManagement taskManagement;
    private TaskInputer taskInputer;
    private Validate validate;

    public Controller() {
        taskInputer = new TaskInputer();
        taskManagement = new TaskManagement();
        validate = new Validate();
    }

    public boolean add() {
        Task t = taskInputer.inputTaskInfomation();
        return taskManagement.addTask(t);
    }

    public Task delete() throws Exception {

        int id = validate.getInt("Enter the id: ", "", Integer.MIN_VALUE, Integer.MAX_VALUE);
        return taskManagement.deleteTask(id);

    }

    public static void displayTask(Task... tasks) {
        System.out.println("------------------------------Task------------------------------");
        System.out.println(Task.TASK_DISPLAY_HEADER);
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void display() {
        System.out.println("------------------------------Task------------------------------");
        System.out.println(Task.TASK_DISPLAY_HEADER);
        for (Task task : taskManagement.getAllTasks()) {
            System.out.println(task);
        }

    }

}
