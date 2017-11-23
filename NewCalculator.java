import java.util.Scanner;

public class NewCalculator {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String thanks = "Thanks for using this calculator. Have a nice day.";

    System.out.println("Hello and welcome to this simple calculator.");
    System.out.println("You're using Version 2.0");
    while (true) {
      System.out.println("What would you like to do?");
      System.out.println("Please choose add, substract, multiply, divide, modulo, squared, power of or quit.");
      String choice = reader.nextLine();

      if (choice.equals("add")) {
        System.out.println("Type in the first number:");
        int number1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type in the second number:");
        int number2 = Integer.parseInt(reader.nextLine());

        int result = adding(number1, number2);

        System.out.println("The result is " + result);

        while (true) {
          System.out.println("Would you like to add another number?");
          String another = reader.nextLine();


          if (another.equals("yes")) {
            System.out.println("Type in the third number:");
            int number3 = Integer.parseInt(reader.nextLine());

            System.out.println("The result is " + adding(result, number3));

          }

          else if (another.equals("no")) {
            System.out.println("Have it your way!");
            break;
          }

          else {
            System.out.println("Please choose one of the options");


          }
        }
      }

      else if (choice.equals("substract")) {
        System.out.println("Type in the first number:");
        int number1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type in the second number:");
        int number2 = Integer.parseInt(reader.nextLine());

        int result = substracting(number1, number2);

        System.out.println("The result is " + result);

        while (true) {
          System.out.println("Would you like to add another number?");
          String another = reader.nextLine();


          if (another.equals("yes")) {
            System.out.println("Type in the third number:");
            int number3 = Integer.parseInt(reader.nextLine());

            System.out.println("The result is " + substracting(result, number3));

          }

          else if (another.equals("no")) {
            System.out.println("Have it your way!");
            break;
          }

          else {
            System.out.println("Please choose one of the options");


          }
        }
      }

      else if (choice.equals("multiply")) {
        System.out.println("Type in the first number:");
        int number1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type in the second number:");
        int number2 = Integer.parseInt(reader.nextLine());

        int result = multiplication(number1, number2);

        System.out.println("The result is " + result);

        while (true) {
          System.out.println("Would you like to add another number?");
          String another = reader.nextLine();


          if (another.equals("yes")) {
            System.out.println("Type in the third number:");
            int number3 = Integer.parseInt(reader.nextLine());

            System.out.println("The result is " + multiplication(result, number3));

          }

          else if (another.equals("no")) {
            System.out.println("Have it your way!");
            break;
          }

          else {
            System.out.println("Please choose one of the options");


          }
        }
      }

      else if (choice.equals("divide")) {
        System.out.println("Type in the first number:");
        int number1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type in the second number:");
        int number2 = Integer.parseInt(reader.nextLine());

        int result = dividing(number1, number2);

        System.out.println("The result is " + result);

        while (true) {
          System.out.println("Would you like to add another number?");
          String another = reader.nextLine();


          if (another.equals("yes")) {
            System.out.println("Type in the third number:");
            int number3 = Integer.parseInt(reader.nextLine());

            System.out.println("The result is " + dividing(result, number3));

          }

          else if (another.equals("no")) {
            System.out.println("Have it your way!");
            break;
          }

          else {
            System.out.println("Please choose one of the options");


          }
        }
      }

      else if (choice.equals("modulo")) {
        System.out.println("Type in the first number:");
        int number1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type in the second number:");
        int number2 = Integer.parseInt(reader.nextLine());

        int result = modulol(number1, number2);

        System.out.println("The result is " + result);

        while (true) {
          System.out.println("Would you like to add another number?");
          String another = reader.nextLine();


          if (another.equals("yes")) {
            System.out.println("Type in the third number:");
            int number3 = Integer.parseInt(reader.nextLine());

            System.out.println("The result is " + modulol(result, number3));

          }

          else if (another.equals("no")) {
            System.out.println("Have it your way!");
            break;
          }

          else {
            System.out.println("Please choose one of the options");


          }
        }
      }

      else if (choice.equals("squared")) {
        System.out.println("What number would you like to have squared?");
        int number = Integer.parseInt(reader.nextLine());

        int result = squared(number);

        System.out.println("The result is " + result);
      }

      else if (choice.equals("power of")) {
        System.out.println("Type in the first number:");
        int number1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type in the second number:");
        int number2 = Integer.parseInt(reader.nextLine());

        int result = powered(number1, number2);

        System.out.println("The result is " + result);

        while (true) {
          System.out.println("Would you like to add another number?");
          String another = reader.nextLine();


          if (another.equals("yes")) {
            System.out.println("Type in the third number:");
            int number3 = Integer.parseInt(reader.nextLine());

            System.out.println("The result is " + powered(result, number3));

          }

          else if (another.equals("no")) {
            System.out.println("Have it your way!");
            break;
          }

          else {
            System.out.println("Please choose one of the options");


          }
        }
      }

      else if (choice.equals("quit")) {
        System.out.println(thanks);
        break;
      }

      else {
        System.out.println("Please choose one of the available options");
      }

      System.exit(0);

      }

    }



  public static int adding(int num1, int num2) {
    int result = num1 + num2;
    return result;
  }

  public static int substracting(int num1, int num2) {
    int result = num1 - num2;
    return result;
  }

  public static int multiplication(int num1, int num2) {
    int result = num1 * num2;
    return result;
  }

  public static int dividing(int num1, int num2) {
    int result = num1 / num2;
    return result;
  }

  public static int modulol(int num1, int num2) {
    int result = num1 % num2;
    return result;
  }

  public static int squared(int num1) {
    int result = num1 * num1;
    return result;
  }

  public static int powered(int num1, int num2) {
    int result = (int)Math.pow(num1, num2);
    return result;
  }


}
