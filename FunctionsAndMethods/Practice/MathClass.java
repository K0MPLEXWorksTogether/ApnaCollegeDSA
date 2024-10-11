package Practice;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Minimum: " + Math.min(num1, num2));
        System.out.println("Maximum: " + Math.max(num1, num2));
        System.out.println("Square root of 1st number: " + Math.sqrt(num1));
        System.out.println("1st number raised to the power of 2nd: " + Math.pow(num1, num2));
        System.out.println("Absolute Difference: " + Math.abs(num1 - num2));

        scan.close();
    }
}
