import java.util.Scanner;

public class conditional {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Hello and welcome to this simple game.");
    System.out.println("You're an archeologist exploring the tomb of a pharaoh.");
    System.out.println("You've just entered the tomb.");
    System.out.println("Where do you want to go?");
    System.out.println("1. Go left");
    System.out.println("2. Go right");

    int first_choice = Integer.parseInt(reader.nextLine());

    if (first_choice == 1) {
      System.out.println("You've just entered the burial chamber.");
      System.out.println("There's a huge sarcophagus in the center of the room.");
      System.out.println("Do you want to open it?");
      System.out.println("1. Open it");
      System.out.println("2. Leave it be.");

      int sacrophagus = Integer.parseInt(reader.nextLine());

      if (sacrophagus == 1) {
        System.out.println("The mummy jumps out and rips your face off.");
        System.out.println("You're dead.");
        System.exit(0);
      }
      else if (sacrophagus == 2) {
        System.out.println("You don't open the sacrophagus. You leave the tomb and live happily ever after.");
        System.exit(0);
      }
      else {
        System.out.println("You died because you didn't choose one of the available options.");
        System.exit(0);
      }
    }
    else if (first_choice == 2) {
      System.out.println("You've entered the Grand Gallery.");
      System.out.println("The walls are full of hieroglyphics and ancient egyptian writing.");
      System.out.println("There's a huge statue at the end of the gallery.");
      System.out.println("Do you want to examine the writing or check out the statue?");
      System.out.println("1. examine the writing");
      System.out.println("2. check out the statue");

      int gallery = Integer.parseInt(reader.nextLine());

      if (gallery == 1) {
        System.out.println("You can't read hieroglyphics.");
        System.out.println("You leave the tomb and live happily ever after.");
        System.exit(0);
      }
      else if (gallery == 2) {
        System.out.println("It's a statue of Amun-Ra, the egyptian Sun God.");
        System.out.println("You lean against the statue.");
        System.out.println("The statue collapses onto your head and you die.");
        System.exit(0);
      }
      else {
        System.out.println("You didn't choose one of the available options. You stumble around the room until you die.");
        System.exit(0);
      }
    }
    else {
      System.out.println("You went neither left nor right.");
      System.out.println("You fall into a pit and die");
      System.exit(0);
    }

  }
}
