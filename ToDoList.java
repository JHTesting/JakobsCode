import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ToDoList {
  private ArrayList<String> list;


  public ToDoList() {
    this.list = new ArrayList<String>();
  }

  public String toString() {
    return "To-Do's: " + this.list;
  }

  public void addToDo(String todo) {
    if (list.contains(todo)) {
      Scanner reader = new Scanner(System.in);
      System.out.println("This item has already been added.");
      System.out.println("Would you like to add it a second time?");
      String choice = reader.nextLine();
      if (choice.equals("yes")) {
        list.add(todo);
        System.out.println(todo + " has been added to the list.");
      }
    }
    else {
      list.add(todo);
      System.out.println(todo + " has been added to the list.");
    }
  }

  public boolean containsString(String todo) {
    if (list.contains(todo)) {
      return true;
    }
    return false;
  }

  public void removeToDo(String todo) {
    if (list.contains(todo)) {
      list.remove(todo);
      System.out.println(todo + " has been removed.");
    }
    else {
      System.out.println(todo + " has not been added yet.");
    }
  }

}
