public class BinarySearch {
    public static int binarySearch(int arr[], int target){
        int result = -1;
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                result = mid;
                return result;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int sample[] = {1, 3, 7, 10, 25, 42};
        System.out.println(binarySearch(sample, 10));
    }
}
