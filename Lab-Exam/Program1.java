class Person {
  String name;

  void display() {
      System.out.println("Name: " + name);
  }
}

class Student extends Person {
  int id;

  Student(String namee, int id) {
      this.name = namee;
      this.id = id;
  }

  void display() {
      super.display();
      System.out.println("ID: " + id);
  }
}

public class Program1 {
  public static void main(String[] args) {
      Student student = new Student("Alice", 101);
      student.display();
  }
}
