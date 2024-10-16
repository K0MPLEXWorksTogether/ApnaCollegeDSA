public class MaxInArray {
    public static int maxInArray(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int sample[] = {1, 3, 10, 9, 7, 5, 3};
        System.out.println(maxInArray(sample));
    }
}
