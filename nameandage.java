import java.util.Scanner;
public class nameandage {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Your name: ");
    String name = reader.nextLine(); //reads a line from the users keyboard
    System.out.println("Your name is " + name);


    System.out.println("Your age: ");
    int age = Integer.parseInt(reader.nextLine()); // reads a string variable from the keyboard and transfers it to an integer
    System.out.println("You are " + age + " years old");


  }
}
