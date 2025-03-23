public class SubArrayAndSum {
  static void printSubArrays(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      for(int j=i; j<arr.length; j++) {
        for(int k=i; k<=j; k++) {
          System.out.print(arr[k]);
        }
        System.out.println();
      }
    }
  }

  static void printSubArraysSum(int arr[]) {
    int MaxSum = Integer.MIN_VALUE;

    for(int i=0; i<arr.length; i++) {
      for(int j=i; j<arr.length; j++) {
        int Sum = 0;
        for(int k=i; k<=j; k++) {
          Sum += arr[k];
        }
        if(Sum > MaxSum) MaxSum = Sum;
      }
    }
    System.out.println("Maximum sum is: " + MaxSum);
  }

  public static void main(String[] args) {
    int numbers[] = {1,2,3,4,5,6};
    printSubArrays(numbers);
    printSubArraysSum(numbers);
  }
}
