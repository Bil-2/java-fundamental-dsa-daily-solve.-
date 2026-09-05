import java.util.Scanner;
public class task163 {//delete an element from an array
    public static void main(String[] args) {
        int size,loc,i;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = r.nextInt();
        int a []  = new int[size];
        System.out.println("Enter elements of array: ");
        for(i=0;i<size;i++)
        {
            a[i] = r.nextInt();
        }
        System.out.print("Enter the location where you want to delete element: ");
        loc = r.nextInt();
        for(i=loc;i<size-1;i++)
        {
            a[i] = a[i+1];
            
        }
        System.out.println("Resultant array: ");
        for(i=0;i<size-1;i++)
        { 
            System.out.print(a[i]+" ");
        }     
      }
    }
  
      