import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }

        scan.close();
    }
}
