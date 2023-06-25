package bo;

import java.util.ArrayList;
import java.util.List;
import model.Task;

public class TaskManagement {

    private List<Task> tasks;
    private int tempId = 0;

    public TaskManagement() {
        tasks = new ArrayList<>();
    }

    public boolean addTask(Task t) {
        t.setId(++tempId);
        return tasks.add(t);
    }

    public Task deleteTask(int id) throws Exception {
        int taskIndex = searchTaskById(id);
        if (taskIndex == -1) {
            throw new Exception("Task does not exist! ");
        } else {

            return tasks.remove(taskIndex);

        }

    }

    private int searchTaskById(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public List<Task> getAllTasks() {
        return tasks;
    }
}
