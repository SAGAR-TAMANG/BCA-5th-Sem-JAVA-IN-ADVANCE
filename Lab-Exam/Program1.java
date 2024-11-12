interface CanBark {
  void Speak();
}

interface CanMeow {
  void Speak();
}

class Dog implements CanBark {
  String name;
  
  Dog(String n) {
    name = n;
  }

  public void Speak() {
    System.out.println(name + " Barks");
  }
}

class Cat implements CanMeow {
  String name;
  
  Cat(String n) {
    name = n;
  }

  public void Speak() {
    System.out.println(name + " Meows");
  }
}

class Program1 {
  public static void main(String[] args) {
    Dog obj1 = new Dog("German Shephard");
    Cat obj2 = new Cat("Billi");

    obj1.Speak();
    obj2.Speak();
  }
}