public class BinarySearchRecursive {
    public static int binarySearchRecursive(int arr[], int target, int left, int right){
        if(left > right){
            return -1;
        }

        int mid = (left + right) / 2;
        if(mid == target){
            return mid;
        }
        else if(mid < target){
            binarySearchRecursive(arr, target, mid+1, right);
        }
        else{
            binarySearchRecursive(arr, target, left, mid-1);
        }

        return -1;
    }    

    public static void main(String[] args) {
        int sample[] = {1, 3, 7, 10, 25, 42};
        System.out.println(binarySearchRecursive(sample,3, 0, sample.length-1));
    }
}
