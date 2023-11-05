import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); //declare once

        System.out.println("Enter integer:");
        int integerInput = scnr.nextInt(); // double  integerInput = 3 -> 3.8

        System.out.println("Enter double:");
        double doubleInput = scnr.nextDouble(); // double doubleInput = 3.77

        System.out.println("Enter character:");
        char charInput = scnr.next().charAt(0); // "s".charAt(0) -> s

        System.out.println("Enter string:");
        String stringInput = scnr.next();

        System.out.println(integerInput + " " + doubleInput + " " + charInput + " " + stringInput); // 99 3.77 z howdy
        System.out.println(stringInput + " " + charInput + " " + doubleInput + " " + integerInput); // howdy z 3.77 99

        System.out.println(doubleInput + " cast to an integer is " + (int) doubleInput); // 3.77 cast to an integer is:

    }
}
