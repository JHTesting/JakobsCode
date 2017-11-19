import java.util.Scanner;

public class exercise40 {

  public static void printstars(int amount) {
    int i = 1;
    while (i <= amount) {
      System.out.print("*");
      i++;
    }
  }

  public static void printwhitespace(int size) {
    int counter = 1;
    while (counter <= size) {
      System.out.print(" ");
      counter++;
    }
  }

  public static void printtriangle(int big) {
    int x = 1;
    while (x <= big) {
      printwhitespace(big - x);
      printstars(x);
      System.out.println(" ");
      x++;
    }
  }

  public static void xmastree(int howhigh) {
    int y = 1;
    int white = howhigh - y;
    int star = 1;
    while (y <= howhigh) {
      printwhitespace(white);
      printstars(star);
      printwhitespace(white);
      System.out.println(" ");
      y++;
      star += 2;
      white--;
    }
    int space = ;
    int counter2 = 0;
    int end = 1;

    // I'm really not sure how to do the stand, I'll try again tomorrow.

    while (counter2 <= end) {
    printwhitespace(space);
    printstars(3);
    printwhitespace(space);
    System.out.println(" ");
    counter2++;
    }
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Would you like to print a triangle or a christmas tree?");
    String answer = reader.nextLine();
    if ((answer.equals("triangle")) || (answer.equals("triangles"))) {

      System.out.println("How high do you want your triangle?");
      int heigth = Integer.parseInt(reader.nextLine());

      printtriangle(heigth);
    }

    else if ((answer.equals("christmas tree")) || (answer.equals("xmastree"))) {

      System.out.println("How high do you want your tree?");
      int biggy = Integer.parseInt(reader.nextLine());

      xmastree(biggy);
    }
    else {
      System.out.println("Please choose triangle or xmastree.");
    }
  }
}
