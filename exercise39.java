import java.util.Scanner;

public class exercise39 {

  public static void printstars(int amount) {
    int i = 1;
    while (i <= amount) {
      System.out.print("*");
      i++;
    }
  }




  public static void printsquare(int sidesize) {
    int counter = 0;
    if (sidesize >= 1) {


      while (counter < sidesize) {
        printstars(sidesize);
        System.out.println(" ");
        counter++;
      }
    }

    else if (sidesize < 1) {
      System.out.println("That is not a valid amount.");
    }

  }



  public static void printrectangle(int width, int heigth) {
    int x = 0;
    while (x < heigth) {
      printstars(width);
      System.out.println(" ");
      x++;
    }
  }

  public static void printtriangle(int size) {
    int y = 1;

    while (y <= size) {
      printstars(y);
      System.out.println(" ");
      y++;
    }
  }





  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Would you like to print stars, squares, rectangles or triangles??");
    String firstchoice = reader.nextLine();

    if ((firstchoice.equals("stars")) || (firstchoice.equals("star"))) {

      while (true) {
        System.out.println("How many stars would you like to print out?");
        int times = Integer.parseInt(reader.nextLine());

        printstars(times);

        System.out.println(" ");

        System.out.println("Would you like to print another line?");
        String choice = reader.nextLine();

        if (choice.equals("no")) {
          break;
      }

    }

  }

  else if ((firstchoice.equals("squares")) || (firstchoice.equals("square"))) {

    while (true) {
          System.out.println("How long should the sides be?");
          int squarenumber = Integer.parseInt(reader.nextLine());

          printsquare(squarenumber);

          System.out.println(" ");

          System.out.println("Would you like to print another line?");
          String another = reader.nextLine();

          if (another.equals("no")) {
            break;
      }
    }
  }

  else if ((firstchoice.equals("rectangle")) || (firstchoice.equals("rectangles"))) {

    while (true) {
      System.out.println("How high should the rectangle be?");
      int heigthnumber = Integer.parseInt(reader.nextLine());

      System.out.println("How wide should it be?");
      int widthnumber = Integer.parseInt(reader.nextLine());

      printrectangle(widthnumber, heigthnumber);

      System.out.println("Would you like to print another line?");
      String again = reader.nextLine();

      if (again.equals("no")) {
        break;
      }
    }
  }

  else if ((firstchoice.equals("triangle")) || (firstchoice.equals("triangles"))) {

    while (true) {
      System.out.println("How high should the triangle be?");
      int triangleheight = Integer.parseInt(reader.nextLine());

      printtriangle(triangleheight);

      System.out.println("Would you like to print another triangle?");
      String againagain = reader.nextLine();

      if (againagain.equals("no")) {
        break;
      }

    }
  }

}
}
