import java.util.Scanner;

public class IncomeTaxCalculator {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float salary = scan.nextFloat();

        if(salary < 5_00_000){
            System.out.println("No Tax!");
        }
        else if(salary >= 5_00_000 && salary <= 10_00_000){
            System.out.println("Tax "+ salary * 0.2);
        }
        else{
            System.out.println("Tax: " + salary * 0.3);
        }

        scan.close();

   } 
}
