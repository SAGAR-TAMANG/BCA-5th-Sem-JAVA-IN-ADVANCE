import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays to store roll numbers and marks for 20 students
        int[] rollNumbers = new int[20];
        int[] marks = new int[20];

        // Input roll numbers and marks
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rollNumbers[i] = scanner.nextInt();
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate average marks
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = sum / 20.0;

        // Display students with marks above 90
        System.out.println("\nStudents with marks above 90:");
        boolean foundAbove90 = false;
        for (int i = 0; i < 20; i++) {
            if (marks[i] > 90) {
                System.out.println("Roll Number: " + rollNumbers[i] + ", Marks: " + marks[i]);
                foundAbove90 = true;
            }
        }
        if (!foundAbove90) {
            System.out.println("None");
        }

        // Display students with marks above average
        System.out.println("\nStudents with marks above average (" + average + "):");
        boolean foundAboveAverage = false;
        for (int i = 0; i < 20; i++) {
            if (marks[i] > average) {
                System.out.println("Roll Number: " + rollNumbers[i]);
                foundAboveAverage = true;
            }
        }
        if (!foundAboveAverage) {
            System.out.println("None");
        }
    }
}
