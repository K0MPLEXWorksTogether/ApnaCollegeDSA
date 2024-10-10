import java.util.Scanner;

public class Until10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("Enter Your Number: ");
            int num = scan.nextInt();

            if(num % 10 == 0){
                break;
            }
            System.out.println(num);
        }
        System.out.println("Exited!");
        scan.close();
    }
}
