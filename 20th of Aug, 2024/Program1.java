class Program1 {
  // Constructor for addition
  Program1(int a, int b) {
      System.out.println("Sum: " + (a + b));
  }

  // Constructor for subtraction
  Program1(int a, int b, boolean isSubtraction) {
      if (isSubtraction) {
          System.out.println("Difference: " + (a - b));
      }
  }

  // Constructor for multiplication
  Program1(double a, double b) {
      System.out.println("Product: " + (a * b));
  }

  public static void main(String[] args) {
      // Create objects with different constructors
      Program1 addition = new Program1(10, 5);
      Program1 subtraction = new Program1(10, 5, true);
      Program1 multiplication = new Program1(3.5, 2.5);
  }
}
