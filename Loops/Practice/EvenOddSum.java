package Practice;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < 10; i++){
            int num = scan.nextInt();
            if(num % 2 == 0){
                evenSum += num;
            }
            else{
                oddSum += num;
            }
        }

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
        scan.close();
    }
}
