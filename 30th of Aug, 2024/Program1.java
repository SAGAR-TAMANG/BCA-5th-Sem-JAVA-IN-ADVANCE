// Write a java program to take the following instruction:
// 1. Create an abstract class
// 2. Create two abstract methods
// 3. Display the details of a student
// 4. Take minimum two sub interface class.

// Create an abstract class
abstract class Student {
  String name;
  int roll;
  
  abstract void display();
  abstract void calculate_grade();
  
  public void details() {
    System.out.println("Your Name: " + name);
    System.out.println("Your Roll: " + roll);
  }

  Student (String name, int roll) {
    this.name = name;
    this.roll = roll;
  }  
}

class Student1 extends Student {
  void calculate_grade() {
    int sub_1 = 70;
    int sub_2 = 78;
    int total = 0;

    total = sub_1 + sub_2;
    int per = total / 2;
    System.out.println("Your percentage is: " + per);
  }

  void display () {
    System.out.println("Student Details: ");
  }

  void fun () {
    System.out.println("Thank you");
  }

  Student1 (String name, int roll) {
    super(name, roll);
  }
}

public class Program1 {
  public static void main(String[] args) {
    Student1 obj = new Student1("Sagar", 101);
    obj.details();
    obj.calculate_grade();
    obj.fun();
  }
}