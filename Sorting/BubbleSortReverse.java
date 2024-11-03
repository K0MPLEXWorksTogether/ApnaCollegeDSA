public class BubbleSortReverse {
    public static void bubbleSortReverse(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int swaps = 0;
            for(int j = 0; j < arr.length - (1 + i); j++){
                if(arr[j] < arr[j + 1]){
                    swaps++;

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if(swaps == 0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int sample[] = {3, 2, 1, 4, 5};
        bubbleSortReverse(sample);

        for(int i = 0; i < sample.length; i++){
            System.err.printf("%d ", sample[i]);
        }
        System.out.println();
    }
}
