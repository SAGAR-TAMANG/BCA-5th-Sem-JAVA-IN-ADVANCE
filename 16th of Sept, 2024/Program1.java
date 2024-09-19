// Write a java program to display the elements of an array.

class Program1 {
  public static void main(String[] args) {
    int number[] = new int[10];

    for (int i = 0; i < number.length; i++) {
      number[i] = i * 5;
    }

    for (int j = 0; j < number.length; j++) {
      System.out.println("Array value at " + j + " is: " + number[j]);
    }
  }
}