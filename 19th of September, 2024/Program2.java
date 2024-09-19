// Write a java program to insert an element in an array.
import java.util.Scanner;

public class Program2 {
  public static void main(String[] args) {
    int arr[] = {5, 8, 2, 7, 1};
    Scanner scn = new Scanner(System.in);

    System.out.println("The Elements:");
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Value at Position " + i + " is "+ arr[i] + " ");
    }
    
    System.out.println("Which position you want to put the value?");
    int pos = scn.nextInt();
    
    System.out.println("What value you want to put?");
    int val = scn.nextInt();

    arr[pos] = val;
    
    System.out.println("The Elements Now:");
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Value at Position " + i + " is "+ arr[i] + " ");
    }
  }
}