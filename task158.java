import java.util.Scanner;
import java.util.Arrays;
public class task158 {//sort(),equals()
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter 1st data in array :");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    System.out.println("\nEnter 2nd data in array :");//equals()
        for (int i = 0; i < b.length; i++) {
            b[i] = r.nextInt();
        }
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        if (Arrays.equals(a, b)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
    
    
    
    
    
      }
  }
}

   