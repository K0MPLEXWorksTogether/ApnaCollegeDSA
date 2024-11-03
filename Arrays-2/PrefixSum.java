public class PrefixSum{
    public static int[] prefixArray(int arr[]){
        int result[] = new int[arr.length];
        int prefix = 0;
        for(int i = 0; i < arr.length; i++){
            prefix += arr[i];
            result[i] = prefix;
        }
        return result;
    }

    public static int maxSubarraySum(int arr[]){
        int prefix[] = prefixArray(arr);
        int maxSum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
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