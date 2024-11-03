public class CountingSortReverse {
    public static void countingSortReverse(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int count[] = new int[max + 1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        int ptr = 0;
        for(int i = max; i > 0; i--){
            while(count[i]-- > 0){
                arr[ptr] = i;
                ptr++;
            }
        }
    }

    public static void main(String[] args) {
        int sample[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSortReverse(sample);

        for(int i = 0; i < sample.length; i++){
            System.out.printf("%d ", sample[i]);
        }
        System.out.println();
    }
}
