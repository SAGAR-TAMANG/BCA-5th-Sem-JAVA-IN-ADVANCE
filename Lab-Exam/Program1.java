class Animal {
  void Speak() {
    System.out.println("");
  }
}

class Dog extends Animal{
  void Speak() {
    System.out.println("Bark");
  }
}

class Cat extends Animal{
  void Speak() {
    System.out.println("Meow");
  }
}

class Program1 {
  public static void main(String[] args) {
    Dog obj = new Dog();
    Cat obj1 = new Cat();

    obj.Speak();
    obj1.Speak();
  }
}