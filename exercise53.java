import java.util.Scanner;

public class exercise53 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type a word:");
    String word = reader.nextLine();


    System.out.println("Length of the first part:");
    int firstpart = Integer.parseInt(reader.nextLine());

    System.out.println("Length of the last part:");
    int endpart = Integer.parseInt(reader.nextLine());

    endpart -= 1;

    String end = endpart(word, endpart);

    String result = part(word, firstpart);

    System.out.println("Firspart: " + result);

    System.out.println("Endpart: " + end);
  }

  public static String part(String word, int firstpart) {
    String result = word.substring(0,firstpart);

    return result;
  }

  public static String endpart(String word, int end) {
    String result = word.substring(end);

    return result;
  }

}
