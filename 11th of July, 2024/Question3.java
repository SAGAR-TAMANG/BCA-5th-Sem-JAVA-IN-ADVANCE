import java.util.Scanner;

// Q1. Write a java program that uses ternary operator to assign a grade based on the student's scroe, use the following grading scale:
// 1. Grade A: 90-100
// 2. Grade B: 80-89
// 3. Grade C: 70-79
// 4. Grade D: 60-69
// 5. Grade F: below 60

public class Question3 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("What is your marks?");
    int marks = scn.nextInt();
    Character grade = (marks >= 90) ? 'A':(marks >= 80) ? 'B' : (marks >= 70) ? 'C' : (marks >= 60) ? 'D' : 'F';
    
    System.out.println("Your Grade Is: " + grade);
  }
}
