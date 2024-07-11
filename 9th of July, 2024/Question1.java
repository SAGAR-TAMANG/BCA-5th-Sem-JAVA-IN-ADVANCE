// Write a program to take the input of your name & display it.
import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Input your Name: ");
    String name = scn.nextLine();
    System.out.println("Input your Address: ");
    String add = scn.nextLine();
    System.out.println("Input your Roll Number: ");
    String roll = scn.nextLine();

    System.out.println("Your name is: " + name);
    System.out.println("Your address is: " + add);
    System.out.println("Your roll number is: " + roll);
  }
}
