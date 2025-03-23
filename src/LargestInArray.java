public class LargestInArray {
  static int largestInArray(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++) {
      if(arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }

  public static void main(String[] args) {
    int numbers[] = {3,7,26,4,4,9,22,5,6};
    System.out.println(largestInArray(numbers));
  }
}
