public class task147 {//array basic 
  public static void main(String[]args){
    int a [] = {1,2,3,4,5};
    System.out.println(a[4]+" ");
    for (int b:a){// [ 1 ]diff way of printing array elements
      System.out.println(b+" ");
      for (int i=0;i<a.length;i++){ //[ 2] 
        System.out.println(a[i]+" ");
      }
    }
  }
  
}
