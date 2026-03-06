import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
public class TaskRepository {
    private HashMap<Integer,Task> tasks=new HashMap<>();
    public void addTask(Task task){
        tasks.put(task.getId(),task);
    }
    public ArrayList<Task> getAllTasks(){
        return new ArrayList<>(tasks.values());
    }
    public ArrayList<Task> getCompletedTasks() {
        return tasks.values().stream()
                .filter(Task::isCompleted)
                .collect(Collectors.toCollection(ArrayList::new));
    }
    public void deleteById(int id) {
        tasks.remove(id);
    }
    public void updateTitle(int id,String newTitle){
        findById(id).setNewTitle(newTitle);
    }
    public Task findById(int id){
        return tasks.get(id);
    }
}
