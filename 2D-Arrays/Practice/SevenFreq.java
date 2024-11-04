package Practice;

public class SevenFreq {
    public static int sevenFreq(int matrix[][]){
        int freq = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 7){
                    freq++;
                }
            }
        }

        return freq;
    }

    public static void main(String[] args) {
        int sample[][] = {
            {4, 7, 8},
            {8, 8, 7}
        };

        System.out.println(sevenFreq(sample));
    }
}
