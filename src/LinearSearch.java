public class LinearSearch {
  // linear time - O(n)
  static int linearSearch(int arr[], int key) {
    for(int i=0; i<arr.length; i++){
     if(arr[i] == key) {
      return i;
     } 
    }
    return -1;
  }

  public static void main(String[] args) {
      int numbers[] = {3,7,2,4,4,9,22,5,6};
      int foundIndex = linearSearch(numbers, 22);
      if(foundIndex == -1) {
        System.out.println("Key not present in the array");
      } else {
        System.out.println("ELement found at index: " + foundIndex);
      }
  }
}
