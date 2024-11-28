class InsertValueArrayTwo {
  public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5};
    
    System.out.print("Before Array: ");
    for (int val: arr) {
      System.out.print(val + " ");
    }
    
    int newVal = 3, pos = 2;
    int[] newArr = new int[5];
    
    for (int i = 0; i < pos; i++) {
      newArr[i] = arr[i];
    }

    newArr[pos] = newVal;

    for (int i = pos+1; i < newArr.length; i++) {
      newArr[i] = arr[i-1];
    }
    
    System.out.print("\nAfter Array: ");
    for (int val: newArr) {
      System.out.print(val + " ");
    }
  }
}