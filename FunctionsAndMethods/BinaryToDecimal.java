public class BinaryToDecimal {
    public static int binaryToDecimal(int binNumber){
        int power = 0;
        int decNum = 0;

        while(binNumber > 0){
            int rem = binNumber % 10;
            decNum += (rem * Math.pow(2, power));

            binNumber /= 10;
            power++;
        }

        return decNum;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(1001));
    }
}
