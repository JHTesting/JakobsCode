import java.util.Scanner;
import java.util.ArrayList;

public class teachers {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    ArrayList<String> teacherlist = new ArrayList<String>();

    System.out.println("What's the name of your favourite teacher?");
    String favourite = reader.nextLine();

    teacherlist.add(favourite);
    teacherlist.add("Lutz");

    System.out.println("What's your second favourite teacher?");
    String second = reader.nextLine();
    teacherlist.add(second);

    System.out.println("What's your third favourite?");
    String third = reader.nextLine();
    teacherlist.add(third);

    System.out.println("What's your least favourite teacher?");
    String least = reader.nextLine();
    teacherlist.add(least);

    System.out.println("The number of teachers is " + teacherlist.size() );
    System.out.println("The first teacher on the list is " + teacherlist.get(0));
    System.out.println("The third teacher on the list is " + teacherlist.get(2));

    teacherlist.remove("Lutz");

    if (teacherlist.contains("Lutz")) {

      System.out.println("Lutz is on the list of teachers!");

    }

    else {

      System.out.println("Luts is not on the list of teachers!");

    }


  }
}
