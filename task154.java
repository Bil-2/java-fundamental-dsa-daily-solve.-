public class task154 {//search an element in array
  public static void main(String[] args) {
    int a[] = {1, 2, 3, 4, 5};
    int search = 6;
    boolean found = false;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == search) {
        found = true;
        break;
      }
    }
    if (found) {
      System.out.println(search + " is found in the array.");
    } else {
      System.out.println(search + " is not found in the array.");
    }
  }
  
}
