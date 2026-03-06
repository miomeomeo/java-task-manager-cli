public class Task {
    private static int nextId=1;
    private int id;
    private String title;
    private boolean completed=false;
    public Task(String title){
        this.title=title;
        this.id=nextId;
        nextId++;
    }
    public boolean isCompleted(){
        return completed;
    }
    public void completeTask(){
        completed=true;
    }

    public String showTask() {
        if(completed){
            return "[X] "+id+". "+title;
        }
        else{
            return "[ ] "+id+". "+title;
        }
    }
    public int getId(){
        return id;
    }
    public void setNewTitle(String newTitle){
        this.title=newTitle;
    }
}
