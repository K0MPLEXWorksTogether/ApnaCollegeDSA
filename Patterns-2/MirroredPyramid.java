import java.util.Scanner;

public class MirroredPyramid {
    public static void mirroredPyramid(int n){
        int size = n;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        mirroredPyramid(size);
        scan.close();

    }
}
