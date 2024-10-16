public class MaxSubarraySum {
    public static int maxSubarraySum(int[] arr){
        int maxSum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int currSum = 0;
                for(int k = i; k <= j; k++){
                    currSum += arr[k];
                }
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int sample[] = {1, -2, 6, -1, 3};
        System.out.println(maxSubarraySum(sample));
    }
}
