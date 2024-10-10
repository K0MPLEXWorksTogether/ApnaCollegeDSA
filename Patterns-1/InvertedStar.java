import java.util.Scanner;

public class InvertedStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        for(int i = size; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        scan.close();
    }
}
