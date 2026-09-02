import java.util.Scanner;
public class task153 {//find sum of array elements
  public static void main(String[] args) {
    Scanner r = new Scanner(System.in);
    int a[] = new int[5];
    int sum = 0;
    System.out.print("enter elements in array ");
    for (int i = 0; i < 5; i++) {
      a[i] = r.nextInt();
    }
    for (int i = 0; i < 5; i++) {
      sum = sum + a[i];
    }
    System.out.print("sum of array elements: " + sum);
  }
  
}
