package Practice;

public class MatrixTranspose {
    public static void matrixTranspose(int matrix[][]){
        if(matrix.length != matrix[0].length){
            return;
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = i + 1; j < matrix[0].length; j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int sample[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        matrixTranspose(sample);

        for(int i = 0; i < sample.length; i++){
            for(int j = 0; j < sample[0].length; j++){
                System.out.printf("%d ", sample[i][j]);
            }
            System.out.println();
        }
    }
}
