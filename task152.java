import java.util.Scanner;

public class task152 {// copy one array to another array
  public static void main(String[] args) {
    int a[] = new int[5];
    int b[] = new int[5];
    Scanner r = new Scanner(System.in);

    System.out.print("enter value in first array ");
    for (int i = 0; i < 5; i++) {
      a[i] = r.nextInt();
    }

    System.out.print("first array elements ");
    for (int i = 0; i < 5; i++) {
      System.out.print(a[i] + " ");
    }

    System.out.print("\nsecond array Element ");
    for (int i = 0; i < 5; i++) {
      b[i] = a[i];
      System.out.print(b[i] + " ");
    }
  }
}
