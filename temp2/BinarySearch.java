class BinarySearch {
  static int binary(int[] arr, int target) {
    int length = arr.length;

    int left = 0, right = length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (target == arr[mid]) {
        return mid;
      } else if (target < arr[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};

    int location = binary(arr, 4);
    System.out.println("Target 4 was found in Index " + location);
  }
}