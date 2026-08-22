import java.awt.Point; 
public class task102 {
    public static void main(String[] args) {
        int firstValue = 10;
        boolean isPassed = true;
        long largeNumber = 123456789L;
        double piValue = 3.14159;
        long salary = 98_765_432_10L;

        Point a = new Point(5, 7);
        System.out.println("First Value: " + firstValue);
        System.out.println("Is Passed: " + isPassed);
        System.out.println("Large Number: " + largeNumber);
        System.out.println("Pi Value: " + piValue);
        System.out.println("Salary: " + salary);
        System.out.println("Point a: (" + a.x + ", " + a.y + ")");
    }
}
