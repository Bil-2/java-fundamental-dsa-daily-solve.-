public class task127 {//ternary operator to check if a number is positive, negative, or zero//
  public static void main(String[] args) {
    long num = 0;
    String result = (num > 0) ? (num + " is a positive number.") : (num < 0) ? (num + " is a negative number.") : (num + " is zero.");
    System.out.println(result);
  }
  
}
