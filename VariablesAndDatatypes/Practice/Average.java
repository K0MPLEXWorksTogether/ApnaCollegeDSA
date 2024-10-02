package Practice;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        float avg = (a + b + c) / 3;
        System.out.println(avg);
        scan.close();
    }
}
