package Practice;

import java.util.Scanner;

public class AreaOfASquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float side = scan.nextFloat();
        float area = side * side;

        System.out.println(area);
        scan.close();
    }
}
