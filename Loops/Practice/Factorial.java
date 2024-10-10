package Practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num == 0 || num == 1){
            System.out.println(1);
        }
        else{
            int fact = 1;
            for(int copy = num; copy > 1; copy--){
                fact *= num;
                num--;
            }
            System.out.println(fact);
        }
        
        scan.close();
    }
}
