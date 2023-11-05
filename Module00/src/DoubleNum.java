import java.util.Scanner;

public class DoubleNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // declare this once, outside of any loop
        System.out.println("Enter x: ");
        int x = scanner.nextInt(); // x = 5
        System.out.println("x doubled is: " + 2*x);

    }
}
