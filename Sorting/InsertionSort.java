public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int sample[] = {3, 4, 2, 5, 1};
        insertionSort(sample);

        for(int i = 0; i < sample.length; i++){
            System.out.printf("%d ", sample[i]);
        }
        System.out.println();
    }
}
