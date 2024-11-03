package Practice;

import java.util.Arrays;

public class ThreeSum {
    public static int[][] threeSum(int[] nums){
        int result[][] = new int[nums.length][nums.length];

        int ptr = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        int triplet[] = new int[3];
                        triplet[0] = nums[i];
                        triplet[j] = nums[j];
                        triplet[k] = nums[k];
                        Arrays.sort(triplet);
                        result[ptr] = triplet;
                        ptr++;
                    }
                }
            }
        }
        return result;
    }    

    public static void main(String[] args) {
        int sample[] = {-1, 0, 1, 2, -1, 4};
        System.out.println(threeSum(sample));
    }
}
