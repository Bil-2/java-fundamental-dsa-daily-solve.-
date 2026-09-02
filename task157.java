import java.util.Scanner;     
public class task157 {//sort array in descending order
  public static void main(String[] args) {
    int a[] = new int[5];
    Scanner r = new Scanner(System.in);
    System.out.print("Enter 5 elements in the array:");     
    for (int i = 0; i < a.length; i++) {
      a[i] = r.nextInt();
    } 
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = 0; j < a.length - i - 1; j++) {
        if (a[j] < a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }
    System.out.println("Sorted array in descending order:");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
  
}
