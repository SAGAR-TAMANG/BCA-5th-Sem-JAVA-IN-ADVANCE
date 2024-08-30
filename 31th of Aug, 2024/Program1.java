class Student {
  int roll;
  String name;
  static String college = "DKD";

  Student (int roll, String name) {
    this.roll = roll;
    this.name = name;
  }
    
  void display() {
    System.out.println("Roll No: " + roll + "Name: " + name + "College: " + college);
  }
}

public class Program1 {
  public static void main(String[] args) {
    Student s1 = new Student(101, "Sagar");

    s1.display();
  }
}

