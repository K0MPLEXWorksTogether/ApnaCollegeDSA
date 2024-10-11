public class BinomialCoefficient {
    public static int binomialCoefficient(int n, int r){
        int coefficient = factorial(n) / ((factorial(r)) * factorial(n - r));
        return coefficient;
    }
    public static int factorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(binomialCoefficient(5, 2));        
    }
}
