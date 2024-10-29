import java.util.Scanner;

class Display {
    int n;          // To store the number
    int fact;       // To store the factorial of the first digit of n

    // Default constructor to initialize data members
    Display() {
        n = 0;
        fact = 1;
    }

    // Method to accept the value of n
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
    }

    // Method to compute the factorial of the first digit of n
    void factorial() {
        // Get the first digit of n
        int firstDigit = Integer.parseInt(Integer.toString(n).substring(0, 1));
        fact = 1;
        
        // Calculate factorial of the first digit
        for (int i = 1; i <= firstDigit; i++) {
            fact *= i;
        }
    }

    // Method to display the factorial of the first digit
    void show() {
        System.out.println("The factorial of the first digit is: " + fact);
    }
}

public class Question7 {
    public static void main(String[] args) {
        // Create an instance of Display
        Display displayObj = new Display();

        // Call methods
        displayObj.input();
        displayObj.factorial();
        displayObj.show();
    }
}
