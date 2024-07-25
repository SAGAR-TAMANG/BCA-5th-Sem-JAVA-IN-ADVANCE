// wap in java to find the factorial by taking user input with the help of a do while loop.
import java.util.Scanner;

public class program2 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("How many numbers of factorial do you want?");
    int val = scn.nextInt();
    int fact = 1;
    int i = 1;

    do {
      fact = fact * i;
      i ++;
    } while (i <= val);

    System.out.println("Factorial Result is:" + fact);
  }
}