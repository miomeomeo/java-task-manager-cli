import java.util.Scanner;
public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    TaskService taskService=new TaskService();
    while(true){
        System.out.println("1 - Create task");
        System.out.println("2 - Show all tasks");
        System.out.println("3 - Complete task");
        System.out.println("4 - Delete task");
        System.out.println("5 - Update task");
        System.out.println("6 - Show completed tasks");
        System.out.println("0 - Exit");
        int choice= scanner.nextInt();
        switch (choice){
            case 1:
                scanner.nextLine();
                System.out.println("Enter task title:");
                String task = scanner.nextLine();
                taskService.createTask(task);
                break;
            case 2:
                System.out.println("Show tasks selected");
                taskService.showAllTasks();
                break;

            case 3:
                System.out.println("Complete selected");
                taskService.showAllTasks();
                System.out.println("Enter the ID of the task you want to complete:");
                int complId= scanner.nextInt();
                taskService.completeTaskById(complId);
                break;

            case 4:
                System.out.println("Delete selected");
                taskService.showAllTasks();
                System.out.println("Enter the task ID you want to delete:");
                int idToDel= scanner.nextInt();
                taskService.deleteTaskById(idToDel);
                break;

            case 5:
                System.out.println("Update selected");
                taskService.showAllTasks();
                System.out.println("Enter the ID of the task whose title you want to update:");
                int idToUpd = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter the new title:");
                String newTitle= scanner.nextLine();
                taskService.updateTaskById(idToUpd,newTitle);
                break;

            case 6:
                System.out.println("Show completed selected");
                taskService.showCompletedTasks();
                break;

            case 0:
                System.out.println("Bye!");
                return;

            default:
                System.out.println("Wrong option");
        }
    }
}
