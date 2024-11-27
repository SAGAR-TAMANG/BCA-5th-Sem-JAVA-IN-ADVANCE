class Arithmetic {
  Arithmetic(int a, int b) {
    System.out.println("Sum: " + (a + b));
  }
  Arithmetic(double a, double b) {
    System.out.println("Division: " + (a / b));
  }
  Arithmetic(int a, int b, Boolean c) {
    System.out.println("Multiple: " + (a * b));
  }
  
  public static void main(String[] args) {
    Arithmetic obj1 = new Arithmetic(1, 2);
    Arithmetic obj2 = new Arithmetic(10.0, 2.0);
    Arithmetic obj3 = new Arithmetic(1, 2, true);
  }
}