import java.util.Scanner;

public class exercise47 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("What's your name?");
    String name = reader.nextLine();
    int length = calculateCharacters(name);
    char first = firstcharacter(name);
    char last = lastcharacter(name);

    System.out.println("Your name is " + length + " characters long");
    System.out.println("Its first character is " + first);
    System.out.println("Its last character is " + last);

    if (length >= 3) {
      char second = secondcharacter(name);
      char third = thirdcharacter(name);
      System.out.println("Its second character is " + second);
      System.out.println("Its third character is " + third);
    }
    

  }

  public static int calculateCharacters(String name) {
    int length = name.length();

    return length;
  }

  public static char firstcharacter(String name) {
    char first = name.charAt(0);

    return first;
  }

  public static char lastcharacter(String name) {
    char last = name.charAt((name.length())-1);

    return last;
  }

  public static char secondcharacter(String name) {
    char second = name.charAt(1);

    return second;
  }

  public static char thirdcharacter(String name) {
    char third = name.charAt(2);

    return third;
  }

}
