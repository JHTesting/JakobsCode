import java.util.Scanner;

public class stringcharacters {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("What's your favourite animal?");
    String favourite = reader.nextLine();

    String anml = animal(favourite);

    System.out.println("Do you have a pet?");
    String pet = reader.nextLine();

    if (pet.equals("yes")) {
      System.out.println("How old is your pet?");
      int age = Integer.parseInt(reader.nextLine());

      System.out.println("So your favourite animal is " + anml + ", you have a " + age + " year old " + pet + ".");



    }

    else if (pet.equals("no")) {
      System.out.println("I'm sorry to hear that.");
      System.out.println("So your favourite animal is " + anml);

    }

    else {
      System.out.println("I don't understand");

    }

    System.out.println("The word " + favourite " is " + favourite.length() + " characters long.");
    

  }

  public static String animal(String name) {
    String anml;

    if ((name.equals("Dog")) || (name.equals("dog"))) {
      anml = "Dog";
    }

    else if ((name.equals("Cat")) || (name.equals("cat"))) {
      anml = "Cat";
    }

    else if ((name.equals("Horse")) || (name.equals("horse"))) {
      anml = "Horse";
    }

    else {
      anml = "Unknown animal";
    }

    return anml;

  }

}
