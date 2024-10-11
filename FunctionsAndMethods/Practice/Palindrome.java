package Practice;

public class Palindrome {
    public static boolean palindromeChecker(int num){
        int copy = num;
        int reverse = 0;

        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }

        if(reverse == copy){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(palindromeChecker(321));
    }
}
