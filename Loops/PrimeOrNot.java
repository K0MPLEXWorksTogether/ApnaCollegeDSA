import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num == 2){
            System.out.println(true);
        }
        else{
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                }
            }

            System.out.println(isPrime);
            scan.close();
        }
        
    }
}
