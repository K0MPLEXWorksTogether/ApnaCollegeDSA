import java.util.Scanner;

public class ZeroOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int start = 1;

        for(int i = 0; i <= size; i++){
            for(int j = 0; j < i; j++){
                System.out.print(start + " ");
                if(start == 1){
                    start = 0;
                }
                else{
                    start = 1;
                }
            }

            System.out.println();
        }

        scan.close();
    }
}
