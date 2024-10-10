package Practice;

import java.util.Scanner;

public class Fever {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float temp = scan.nextFloat();

        if(temp >= 103.5){
            System.out.println("Fever");
        }
        else{
            System.out.println("No Fever");
        }

        scan.close();
    }
}
