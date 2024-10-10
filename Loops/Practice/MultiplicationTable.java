package Practice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }
        scan.close();
    }
}
