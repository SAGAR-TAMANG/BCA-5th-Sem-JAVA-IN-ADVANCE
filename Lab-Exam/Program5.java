import java.util.Arrays;

class Program5 {
  public static void main(String[] args) {
    int[] arr = new int[5];
    
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 10;
    arr[3] = 30;
    
    System.out.println("Initial Array: " + Arrays.toString(arr));

    Arrays.sort(arr);
    
    System.out.println("Sorted Array: " + Arrays.toString(arr));
  }
}