public class PrimeOptimized {
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

    public static void main(String[] args) {
        System.out.println(primeChecker(5));
    }
}
