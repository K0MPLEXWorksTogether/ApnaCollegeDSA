public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int sample[] = {5, 4, 1, 3, 2};
        selectionSort(sample);

        for(int i = 0; i < sample.length; i++){
            System.out.printf("%d ", sample[i]);
        }
        System.out.println();
    }
}
