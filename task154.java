import java.util.Scanner;
public class task154 {//search an element in array
  public static void main(String[] args) {
    int a[] = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 elements in the array:");
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }                  
    System.out.println("Enter the element to search:");
    int search = sc.nextInt();
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == search) {
        count++;
      }
    }
    if (count > 0) {
      System.out.println(search + " is found in the array."+count+" times.");
    } else {
      System.out.println(search + " is not found in the array.");
    }
  }
  
}
