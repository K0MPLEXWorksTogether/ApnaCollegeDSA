public class KadanesAlgorithm {
    public static int maxSubarraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(currSum + arr[i] < 0){
                currSum = 0;
            }
            else{
                currSum += arr[i];
            }
            
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }

    public static void main(String args[]){
        int sample[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxsum = maxSubarraySum(sample);
        System.out.println(maxsum);
    }
}
