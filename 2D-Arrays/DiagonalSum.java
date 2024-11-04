public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        int len = matrix.length;

        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(i == j && i + j != len - 1){
                    sum += matrix[i][j];
                }
            }
        }

        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(i + j == len - 1 && i != j){
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }

    public static int diagonalSumOptimised(int mat[][]){
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            sum += mat[i][i];

            if(i != mat.length - 1 - i){
                sum += mat[i][mat.length - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int sample[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(diagonalSum(sample));
    }
}
