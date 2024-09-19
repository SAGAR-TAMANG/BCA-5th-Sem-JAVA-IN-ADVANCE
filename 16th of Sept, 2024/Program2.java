// Write a java program to display the sum of 10 natural numbers using an array.

class Program2 {
  public static void main(String[] args) {
    int number[] = new int[10];
    int sum = 0;

    for (int i = 1; i < number.length; i++) {
      number[i] = i;
    }

    for (int i = 1; i < number.length; i++) {
      System.out.println("Element :" + number[i]);
      sum = sum + number[i];
    }

    System.out.println("The sum is :" + sum);
  }
}