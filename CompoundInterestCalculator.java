import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter the rate of interest (per annum):");
        double rate = scanner.nextDouble();

        System.out.println("Enter the number of times interest is compounded per year:");
        int timesCompounded = scanner.nextInt();

        System.out.println("Enter the time the money is invested for (in years):");
        int time = scanner.nextInt();

        double compoundInterest = principal * Math.pow((1 + rate / (timesCompounded * 100)), timesCompounded * time);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
