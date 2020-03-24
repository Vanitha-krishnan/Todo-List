import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.*;
import java.util.Date;  
import java.util.Set;

public class Main {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String column = "";
    // String dueDate;
   
    ArrayList myList = new ArrayList();


    HashMap  projectName = new HashMap();
   

    int choice = 0;
    int subchoice=0;
    while (choice != 3) {

        System.out.println();
        System.out.println("Welcome to ToDoLy");
        System.out.println("You have X tasks todo and Y tasks are done!");
        System.out.println("Pick an option:");
        System.out.println("(1) Show Task List(by date or project)");
        System.out.println("(2) Add New Task");
        System.out.println("(3) Edit Task(update,mark as done,remove)");
        System.out.print("(4) Save and Quit");
        choice = input.nextInt();
       
        int count = 0;
          if (choice == 1) {
                System.out.println(projectName);                    
                         
        }
        if (choice == 2) {
          String title;String dueDate;String project;String status;
          Map my_dict = new TreeMap();
          Scanner in = new Scanner(System. in);
          System. out. println("Enter title");
          title = in. nextLine();
          my_dict.put("title",title);
          System.out.println("Enter Due Date");
          dueDate = in.nextLine();
          System.out.println("Enter Project");
          project = in.nextLine();
          my_dict.put("dueDate",dueDate);  
          System.out.println("Enter Status");
          status = in.nextLine();
          my_dict.put("status",status);  

          if(projectName.containsKey(project)){
                System.out.println("key same");
            }else{
                System.out.println("key different");
            }
          projectName.put(project,my_dict);
          myList.add(projectName);
            }

     
         if (choice == 3) {
             while (subchoice != 5) {
                String updateTask;
                Scanner in = new Scanner(System. in);
                System.out.println("(1)Update the task");
                System.out.println("(2)Mark as done");
                System.out.println("(3)Remove the task");
                subchoice = input.nextInt();
                if(subchoice == 1){
                    Map my_dict = new TreeMap();
                   
                    System.out.println("1");
                    System.out.println("Enter the task to be updated");
                    updateTask = in.nextLine();
                    System.out.println(projectName);
                    if(projectName.containsKey(updateTask)){
                        System.out.println(projectName.get(updateTask));
                        String title;String dueDate;String project;String status;
                        System. out. println("Enter title");
                        title = in. nextLine();
                        my_dict.put("title",title);
                        System.out.println("Enter Due Date");
                        dueDate = in.nextLine();
                        System.out.println("Enter Project");
                        project = in.nextLine();
                        my_dict.put("dueDate",dueDate);  
                        System.out.println("Enter Status");
                        status = in.nextLine();
                        my_dict.put("status",status);  
                        projectName.put(project,my_dict);
                        System.out.println(projectName);

                    }else{
                        System.out.println("no key");

                    }
                }
               
                if(subchoice == 2){
                    System.out.println("2");
                   
                    String taskTitle;String projectTitle;
                    System.out.println("Enter the project title");
                    projectTitle = in.nextLine();
                    System.out.println("Enter the task title");
                    taskTitle = in.nextLine();
                    if(projectName.containsKey(projectTitle)){
                        Object values1 = projectName.get(projectTitle);
                        System.out.println("contains key");

                    }else{
                        System.out.println("no key");
                    }
                }
                if(subchoice == 3){
                    String taskTitle;String projectTitle;
                    System.out.println("Enter the project title");
                    projectTitle = in.nextLine();
                    System.out.println("Enter the task title");
                    taskTitle = in.nextLine();
         
                    if(projectName.containsKey(taskTitle)){
                        System.out.println(projectName.get(projectTitle));
                        projectName.remove(projectName.get(projectTitle));
                        System.out.println(projectName);
                       
                    }
                }
             }
        }
        if (choice == 4) {
            break;
        }
   
}
}
}

