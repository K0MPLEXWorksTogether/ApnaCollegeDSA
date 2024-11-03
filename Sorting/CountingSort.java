public class CountingSort {
    public static void countingSort(int arr[]){
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
        for(int i = 0; i < max; i++){
            while(count[i]-- > 0){
                arr[ptr] = i;
                ptr++;
            }
        }
    }

    public static void main(String[] args) {
        int sample[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(sample);

        for(int i = 0; i < sample.length; i++){
            System.out.printf("%d ", sample[i]);
        }
        System.out.println();
    }
}
