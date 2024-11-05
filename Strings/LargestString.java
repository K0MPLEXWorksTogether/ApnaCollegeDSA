public class LargestString {
    public static String largestString(String strs[]){
        String largest = strs[0];
        for(int i = 0; i < strs.length; i++){
            if(largest.compareTo(strs[i]) < 0){
                largest = strs[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        String strings[] = {"aaa", "aab", "aac"};
        System.out.println(largestString(strings));
    }
}
