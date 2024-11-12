public class upa1 {
 
  public static void bubbleSort(int[] arr) {
      int n = arr.length;
      for (int i = 0; i < n - 1; i++) {
          for (int j = 0; j < n - i - 1; j++) {
              // Swap if the current element is greater than the next element
              if (arr[j] > arr[j + 1]) {
                  int temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
              }
          }
      }
  }
  public static void printArray(int[] arr) {
      for (int num : arr) {
          System.out.print(num + " ");
      }
      System.out.println();
  }

  public static void main(String[] args) {
      int[] arr = {64, 25, 12, 22, 11};

      System.out.println("Original array:");
      printArray(arr);

      // Perform Bubble Sort
      bubbleSort(arr);

      System.out.println("Sorted array:");
      printArray(arr);
  }
}
