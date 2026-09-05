import java.util.Scanner;
public class task162 {//inseart an element in an array
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements of the array:");
        for (int i = 0; i < a.length; i++) {    
            a[i] = sc.nextInt();
        }                 
        int n = a.length;
        int element = 10; // Element to be inserted
        int position = 2; // Position where the element is to be inserted (0-based index)

        // Create a new array with one extra space
        int[] newArray = new int[n + 1];

        // Copy elements before the position
        for (int i = 0; i < position; i++) {
            newArray[i] = a[i];
        }

        // Insert the new element at the specified position
        newArray[position] = element;

        // Copy the remaining elements after the position
        for (int i = position; i < n; i++) {
            newArray[i + 1] = a[i];
        }

        // Print the new array
        System.out.println("Array after inserting " + element + " at position " + position + ":");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
  
}
