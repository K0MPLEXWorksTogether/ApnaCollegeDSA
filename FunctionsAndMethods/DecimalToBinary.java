public class DecimalToBinary {
    public static int decimalToBinary(int decNumber){
        int power = 0;
        int binNumber = 0;

        while(decNumber > 0){
            int rem = decNumber % 2;
            binNumber += (rem * Math.pow(10, power));

            decNumber /= 2;
            power++;

        }
        return binNumber;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(10));
    }
}
