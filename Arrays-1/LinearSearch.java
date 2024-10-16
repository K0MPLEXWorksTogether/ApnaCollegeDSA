public class LinearSearch {
    public static int linearSearch(int[] arr, int target){
        int result = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                result = i;
                return result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int sample[] = {1, 3, 10, 9, 7, 5, 3};
        System.out.println(linearSearch(sample, 7));
    }
}
