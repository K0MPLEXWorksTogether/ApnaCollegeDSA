public class MatrixCreation {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix[i][j] = 10;
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}