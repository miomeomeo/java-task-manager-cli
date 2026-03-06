public class TaskService {
    private TaskRepository taskRepository=new TaskRepository();

    public void createTask(String title){
        Task task=new Task(title);
        taskRepository.addTask(task);
    }
    public void completeTaskById(int id){
        Task task = taskRepository.findById(id);
        if (task == null) {
            System.out.println("Task not found");
            return;
        }
        task.completeTask();
    }

    public void showAllTasks() {
        taskRepository.getAllTasks()
                .forEach(task -> System.out.println(task.showTask()));
    }
    public void showCompletedTasks(){
        taskRepository.getCompletedTasks()
                .forEach(task -> System.out.println(task.showTask()));
    }
    public void deleteTaskById(int id){
        if (taskRepository.findById(id)==null){
            System.out.println("Task not found");
        }
        else{
            taskRepository.deleteById(id);
        }
    }
    public void showSelectedTask(int id){
        System.out.println(taskRepository.findById(id).showTask());
    }
    public void updateTaskById(int id,String newTitle){
        if (taskRepository.findById(id)==null){
            System.out.println("Task not found");
        }
        else {
            taskRepository.updateTitle(id, newTitle);
        }
    }
}
