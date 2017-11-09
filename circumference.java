import java.util.Scanner;

public class circumference {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Hello, welcome to this simple calculator");
    System.out.println("What's the radius of the object you'd like to know the circumference of?");

    int radius = Integer.parseInt(reader.nextLine());

    double ccf = 2 * Math.PI * radius;

    System.out.println("The circumference of your chosen object is " + ccf);



  }
}
