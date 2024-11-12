abstract class Upasana {
  abstract void Print();

  int variable; // Declaration
  int variable1 = 2; // Declaration & Definition
}

class Upasana1 extends Upasana {
  void Print() {
    System.out.println("I am Upasana");
  }
}

class Program2 {
  public static void main(String[] args) {
    Upasana1 obj1 = new Upasana1();
    obj1.Print();
  }
}