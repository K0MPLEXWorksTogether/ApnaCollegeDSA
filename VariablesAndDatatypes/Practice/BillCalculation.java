package Practice;

import java.util.Scanner;

public class BillCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float pencil = scan.nextFloat();
        float pen = scan.nextFloat();
        float eraser = scan.nextFloat();

        float totalCost = pencil + pen + eraser;
        float bill = totalCost * 1.18f;
        System.out.println(bill);

        scan.close();
    }   
}
