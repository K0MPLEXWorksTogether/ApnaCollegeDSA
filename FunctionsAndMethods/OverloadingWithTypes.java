public class OverloadingWithTypes {
    public static int sum(int a, int b){
        return a + b;
    }
    public static float sum(float a, float b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(0.5f, 1.5f));
        System.out.println(sum(5, 10));
    }
}
