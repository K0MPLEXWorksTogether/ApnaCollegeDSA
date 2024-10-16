import java.util.Scanner;

public class ReadingWritingArrays {
    public static void main(String[] args) {
        int myArray[] = new int[5];
        Scanner scan = new Scanner(System.in);

        System.out.println("Input Values For The Array:");
        for(int i = 0; i < 5; i++){
            myArray[i] = scan.nextInt();
        }

        System.out.println("Your Array Is:");
        for(int i = 0; i < 5; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        scan.close();
    }    
}
