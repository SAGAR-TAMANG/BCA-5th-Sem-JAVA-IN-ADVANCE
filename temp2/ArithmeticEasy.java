class Sum {
  Sum(int a, int b) {
    System.out.println("Sum is: " + a + b);
  }
}

class Multiple {
  Multiple(int a, int b) {
    System.out.println("Multiple is: " + (a * b));
  }
}
class Division {
  Division(int a, int b) {
    System.out.println("Division is: " + a / b);
  }
}

class ArithmeticEasy {
  public static void main(String[] args) {
    Sum sum = new Sum(1, 2);
    Multiple Multiple = new Multiple(1, 2);
    Division Division = new Division(1, 2);
  }
}