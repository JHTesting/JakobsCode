import java.util.Scanner;

public class bunker {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("You are on a hiking trip near the west coast of Finland.");
    System.out.println("You see a cave entrance in the ground and decide to enter.");
    System.out.println("In the cave, you find a massive concrete wall with a message written on it.");
    System.out.println("The message reads:");
    System.out.print("Sending this message was important to us. We considered ourselves to be a powerful culture.");
    System.out.print("This place is not a place of honor, no highly esteemede deed is commemorated here, nothing valued is here. ");
    System.out.print("What is here was dangerous and repulsive to us. ");
    System.out.print("This message is a warning about danger. ");
    System.out.print("The danger is in a particular location, it increases toward a center, the center of danger is here. ");
    System.out.print("It is of particular size and shape, and below us. ");
    System.out.print("The danger is still present, in your time as it was in ours. ");
    System.out.print("The danger is to the body, and it can kill. ");
    System.out.print("The form of the danger is an emanation of energy. ");
    System.out.print("The danger is unleashed only if you go past this wall and disturb this place. ");
    System.out.print("This place is best left shunned and uninhabited. ");
    System.out.print("Next to this text, you see images of spikes and dead nature. ");
    System.out.println("Do you decide to go in?");
    String choice = reader.nextLine();

    if (choice.equals("no")) {
      System.out.println("You walk away and continue your hiking trip undisturbed.");
      System.exit(0);
    }

    else if (choice.equals("yes")) {
      System.out.println("You go in and stand inside a room full of uranium.");
      System.out.println("You decide to leave, but you die of radiation poisoning a few years later.");
      System.exit(0);
    }
  }
}
