import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class program {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ToDoList list = new ToDoList();

    System.out.println("Welcome to this To-Do-List program!");
    while (true) {
      System.out.println("Please choose between show, add, remove and quit");
      String choice = reader.nextLine();

      if (choice.equals("show")) {
        System.out.println(list);
      }

      else if (choice.equals("add")) {
        System.out.println("What would you like to add?");
        String item = reader.nextLine();
        list.addToDo(item);
      }

      else if (choice.equals("remove")) {
        System.out.println("Which item would you like to remove?");
        System.out.println(list);
        String remove = reader.nextLine();
        list.removeToDo(remove);
      }

      else if (choice.equals("quit")) {
        System.out.println("Thanks for using this program. Have a nice day.");
        break;
      }

      else {
        System.out.println("Please choose between the available options.");
      }

    }

  }
}
