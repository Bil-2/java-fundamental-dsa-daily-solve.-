import java.util.Scanner;
public class task160 {//find biggest element in array
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        int[] a = new int[5];
        System.out.println("Enter 5 elements of the array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }     
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("The biggest element in the array is: " + max);
    }
  
}
