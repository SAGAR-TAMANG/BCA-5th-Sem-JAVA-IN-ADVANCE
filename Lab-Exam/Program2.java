abstract class Animal {
  abstract void speak();
}

class Upasana extends Animal {
  void speak() {
    System.out.println("Meow");
  }
}

class Program2 {
  public static void main(String[] args) {
    Upasana obj1 = new Upasana();
    obj1.speak();
  }
}