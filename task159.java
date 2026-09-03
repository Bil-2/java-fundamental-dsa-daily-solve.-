import java.util.Scanner;
import java.util.Arrays;
public class task159 {//compare arrays 
  public static void main(String[] args) {
int a1[]=new int[5];
int b1[]=new int[5];
Scanner r=new Scanner(System.in);
System.out.println("Enter 1st array data :");
for(int i=0;i<a1.length;i++){
  a1[i]=r.nextInt();
}
System.out.println("Enter 2nd array data :");
for(int i=0;i<b1.length;i++){
  b1[i]=r.nextInt();
}
if (Arrays.equals(a1, b1)){
  System.out.println("Both arrays are equal");
}
else{
  System.out.println("Both arrays are not equal");
}
}
}












  


