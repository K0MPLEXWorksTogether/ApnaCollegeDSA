package Practice;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String positiveOrNegative = (num > 0) ? "Positive" : "Negative";

        System.out.println(positiveOrNegative);
        scan.close();
    }
}
