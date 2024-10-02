import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float rad = scan.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);

        scan.close();
    }
}
