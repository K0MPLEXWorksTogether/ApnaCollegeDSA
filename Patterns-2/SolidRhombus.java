public class SolidRhombus {
    public static void solidRhombus(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solidRhombus(5);
    }
}
