import java.util.Scanner;

public class PrintReverse{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int copy = num; copy != 0; copy /= 10){
            System.out.print(copy % 10);
        }
        System.out.println();
        scan.close();
    }
}