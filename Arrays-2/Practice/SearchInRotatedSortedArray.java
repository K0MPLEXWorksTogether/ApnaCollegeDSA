package Practice;

public class SearchInRotatedSortedArray {
    public static int rotatedSortedArray(int[] nums, int target){
        int result = -1;
        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(target == nums[mid]){
                result = mid;
                break;
            }

            // Left Sorted
            if(nums[left] <= nums[mid]){
                if(target > nums[mid]|| target < nums[left]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }

            //Right Sorted
            else{
                if(target < nums[mid] || target > nums[right]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int sample[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(rotatedSortedArray(sample, 0));
    }
}
