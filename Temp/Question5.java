import java.util.Scanner;

class Sum {
    // Data member
    private int n;

    // Parameterized constructor to initialize 'n'
    public Sum(int n) {
        this.n = n;
    }

    // Method to input the value of 'n'
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
    }

    // Method to check and display whether 'n' is a pronic number
    public void display() {
        boolean isPronic = false;

        // Check if 'n' is a pronic number
        for (int i = 0; i * (i + 1) <= n; i++) {
            if (i * (i + 1) == n) {
                isPronic = true;
                break;
            }
        }

        // Display the result
        if (isPronic) {
            System.out.println(n + " is a Pronic number.");
        } else {
            System.out.println(n + " is not a Pronic number.");
        }
    }

    public static void main(String[] args) {
        // Create an object of the Sum class and call its methods
        Sum number = new Sum(0); // Initialize with 0 or any default value
        number.input();
        number.display();
    }
}
