import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int sum = 0;
        int count = 1;
        while(count <= n){
            sum += count;
            count++;
        }

        System.out.println(sum);
        scan.close();
    }    
}
