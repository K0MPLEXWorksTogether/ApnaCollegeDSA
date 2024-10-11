public class Factorial {
    public static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            int fact = 1;
            for(int i = 2; i <= num; i++){
                fact *= i;
            }
            return fact;
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
