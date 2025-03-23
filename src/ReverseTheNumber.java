public class ReverseTheNumber {

  static int reverseNumber(int number) {
    int rev = 0;
    while(number > 0) {
      // extract the last digit
      int lastDigit = number % 10;
      // make place for the next digit in the sequence
      rev = (rev*10) + lastDigit;

      // shorten the number one digit
      number = number / 10;
    }
    return rev;
  }

  public static void main(String[] args) {
    System.out.println(reverseNumber(12345));
  }
}