import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        char start = 'A';

        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(start);
                start++;
            }
            System.out.println();
        }
        scan.close();
    }
}
