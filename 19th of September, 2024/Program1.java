// Sorting an Array

public class Program1 {
  public static void main(String[] args) {
    int arr[] = {5, 8, 2, 7, 1};
    int temp = 0;

    System.out.println("The Element Before Sorting:");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
    
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    
    System.out.println("Element After Sorting: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
  }
}