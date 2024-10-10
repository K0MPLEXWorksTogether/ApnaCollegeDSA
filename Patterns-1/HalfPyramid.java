import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        for(int line = 1; line <= size; line++){
            for(int num = 1; num <= line; num++){
                System.out.print(num);
            }
            System.out.println();
        }
        scan.close();
    }
}
