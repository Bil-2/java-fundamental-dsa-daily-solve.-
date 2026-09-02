import java.util.Scanner;
public class task155 {//find average of array elements
  public static void main(String[] args) {
    int a[] = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 elements in the array:");
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }                           
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    double average = (double) sum / a.length;
    System.out.println("The average of the array elements is: " + average);
  }
  
}
