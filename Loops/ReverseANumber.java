import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int reverse = 0;

        while(num > 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }

        System.out.println(reverse);
        
        scan.close();
    }
}
