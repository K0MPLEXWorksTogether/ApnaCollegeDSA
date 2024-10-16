public class ReverseAnArray {
    public static void reverseArray(int arr[]){
        for(int i = 0, j = arr.length - 1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int sample[] = {1, 2, 3, 4, 5, 6};
        reverseArray(sample);

        for(int num: sample){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
