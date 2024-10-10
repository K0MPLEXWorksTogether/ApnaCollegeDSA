import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if(age >= 18){
            System.out.println("Adult");
        }
        else if(age < 18 && age >= 12){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Child");
        }
        scan.close();
    }
}
