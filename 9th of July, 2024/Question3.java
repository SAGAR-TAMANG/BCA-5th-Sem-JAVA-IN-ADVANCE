// Write a program to see if the user is eligible for voting using logical operators where Age > 18
import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    Scanner upasana = new Scanner(System.in);

    System.out.println("Give your age: ");
    double age = upasana.nextDouble();
    System.out.println("Select your nationality: in or np");
    String nationality = upasana.nextLine();

    if (age > 18 && nationality == "in") {
      System.out.println("You are eligible for Indian elections");
    } else {
      System.out.println("You are not eligible for Indian elections");
    }
  }
}
