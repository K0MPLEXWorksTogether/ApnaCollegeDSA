import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 1;
        while (count <= n) {
            System.out.print(count + " ");
            count++;
        }

        scan.close();
    }
}
