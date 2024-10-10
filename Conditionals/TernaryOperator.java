import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        String evenOrOdd = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);
        scan.close();
    }
}
