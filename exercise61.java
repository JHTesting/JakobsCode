import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class exercise61 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> countries = new ArrayList<String>();

    System.out.println("What country do you live in?");
    String live = reader.nextLine();

    System.out.println("What's the last country you visited?");
    String visit = reader.nextLine();

    System.out.println("What country would you like to visit next?");
    String next = reader.nextLine();

    System.out.println("");

    countries.add(live);
    countries.add(visit);
    countries.add(next);


    System.out.println("You entered " + count(countries) + " countries.");
    System.out.println("The countries you entered are:");
    print(countries);

    removeFirst(countries);

    System.out.println("This is what the list looks like if we remove the first item!");
    print(countries);

    System.out.println("Now we remove the last item from the list!");
    removeLast(countries);

    print(countries);


  }

  public static int count(ArrayList<String> x) {
    return x.size();
  }

  public static void print(ArrayList<String> printed) {
    for (String word : printed) {
        System.out.println( word );
    }
  }

  public static void removeFirst(ArrayList<String> x) {
    x.remove(0);
  }

  public static void removeLast(ArrayList<String> list) {
    list.remove( ( list.size() ) - 1 );
  }


}
