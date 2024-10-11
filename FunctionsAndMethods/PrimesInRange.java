import java.util.Scanner;

public class PrimesInRange{
    public static boolean primeChecker(int num){
        if(num == 2){
            return true;
        }
        boolean isPrime = true;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void primesInRange(int n){
        for(int i = 2; i <= n; i++){
            if(primeChecker(i)){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        primesInRange(number);
        scan.close();
    }
}