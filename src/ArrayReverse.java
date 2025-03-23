public class ArrayReverse {
  static void reverseArray(int arr[]) {
    int start = 0, end = arr.length-1;
    while(start < end) {
      int temp = arr[end];
      arr[end] = arr[start];
      arr[start] = temp;
      start++;
      end--;
    }

    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int numbers[] = {3,7,2,4,4,9,22,5,6};
    reverseArray(numbers);
  }
}
