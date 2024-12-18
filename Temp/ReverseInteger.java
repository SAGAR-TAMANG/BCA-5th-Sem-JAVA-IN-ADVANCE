import java.util.Scanner;

class ReverseInteger {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("Number: ");
    int num = scn.nextInt();
    int reverse = 0;
    
    while (num != 0) {
      int digit = num % 10;
      reverse = reverse * 10 + digit;
      num /= 10;
    }

    System.out.println("Reversed: " + reverse);
  }
} 