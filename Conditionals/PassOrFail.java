import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int marks = scan.nextInt();
        String result = (marks >= 33) ? "Pass" : "Fail";

        System.out.println(result);
        scan.close();
    }
}
