// Q. Write a java program to display student name, subject, roll number using parameterized constructor. 

import java.util.Scanner;

class Upa {
  String name;
  String subject;
  int roll_no;
  Upa(String n, String s, int r) {
    name = n;
    subject = s;
    roll_no = r;
  }
}

class Program1 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Give your name: ");
    String n = scn.nextLine();
    System.out.println("Give your Subject: ");
    String s = scn.nextLine();
    System.out.println("Give your Rool Number: ");
    int r = scn.nextInt();

    Upa obj1 = new Upa(n, s, r);

    System.out.println("Name: " + obj1.name);
    System.out.println("Subject: " + obj1.subject);
    System.out.println("Roll No: " + obj1.roll_no);
  }
}