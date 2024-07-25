import java.util.Scanner;

public class program4 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    String author = "Apple";
    String enter_author;

    do {
      System.out.println("Enter Password");
      enter_author = scn.nextLine();

      if (enter_author.equals(author)) {
        System.out.println("Correct Password");
      }
      else {
        System.out.println("Incorrect Password");
      }
    } while (enter_author == author);
    
  }
}
