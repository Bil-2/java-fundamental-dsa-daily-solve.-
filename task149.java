import java.util.Arrays;
public class task149 {//tostring method
  public static void main(String[] args) {
    String a[] = {"apple", "banana", "cherry","coconut"};
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.asList(a));//toList method
    int arr[][] = {{1, 2}, {3, 4}, {5, 6}};//deepToString method
    System.out.println(Arrays.deepToString(arr)); 
  }}