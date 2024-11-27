import java.util.Scanner;

class InsertValueArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5};
    
    Scanner scn = new Scanner(System.in);

    // Display
    System.out.print("Array: ");
    for (int val: arr) {
      System.out.print(val + " ");
    }
    
    System.out.println("What number do you want to add?");
    int newVal = scn.nextInt();

    System.out.println("What position do you want to store in?");
    int pos = scn.nextInt();

    int[] newArr = new int[5];
    
    for (int i = 0; i < pos; i++) {
      newArr[i] = arr[i];
    }

    newArr[pos] = newVal;

    for (int i = pos+1; i < newArr.length - 1; i++) {
      newArr[i] = arr[i+1];
    }
    
    // Display
    System.out.print("Array: ");
    for (int val: newArr) {
      System.out.print(val + " ");
    }    
  }
}