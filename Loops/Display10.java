import java.util.Scanner;

public class Display10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        do{    
            System.out.print("Enter Your Number: ");
            int num = scan.nextInt();
            if(num % 10 == 0){
                System.out.println("Skipped");
                continue;
            }
            System.out.println(num);
        } while(true);
    }
}
