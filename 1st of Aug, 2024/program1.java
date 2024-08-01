// Create a class calculator implement overload method of addition, multiplication, divison, and subtraction.

import java.util.Scanner;

class Calculator {
  public int calculator(int x, int y, int z, int a, int b) {
    return x + y + z + a + b;
  }

  public int calculator(int x, int y, int z, int a) {
    return x * y * z * a;
  }

  public int calculator(int x, int y, int z) {
    return x - y - z;
  }

  public int calculator(int x, int y) {
    return x / y;
  }
}

public class program1 {
  public static void main(String[] args) {
    Calculator objcal = new Calculator();
    Scanner scn = new Scanner(System.in);
    System.out.println("Which operation do you want to perform? (*, /, +, -)");

    String op = scn.nextLine();
    int val = 0;
    System.out.println("OP is:" + op);
    if (op.equals("+")) {
      System.out.println("Give two numbers :");
      int x = scn.nextInt();
      int y = scn.nextInt();
      int z = 0;
      int a = 0;
      int b = 0;

      val = objcal.calculator(x, y, z, a, b);
    }
    else if (op.equals("*")) {
      System.out.println("Give two numbers: ");
      int x = scn.nextInt();
      int y = scn.nextInt();
      int z = 1;
      int a = 1;

      val = objcal.calculator(x, y, z, a);
    }
    else if (op.equals("/")) {
      System.out.println("Give two numbers: ");
      int x = scn.nextInt();
      int y = scn.nextInt();

      val = objcal.calculator(x, y);
    }
    else if (op.equals("-")) {
      System.out.println("Give two numbers: ");
      int x = scn.nextInt();
      int y = scn.nextInt();
      int z = 0;

      val = objcal.calculator(x, y, z);
    } else {
      System.out.println("Invalid Operation");
    };

    System.out.println("The result is: " + val);
  }
}
