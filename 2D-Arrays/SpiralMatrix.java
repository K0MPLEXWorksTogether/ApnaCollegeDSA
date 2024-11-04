public class SpiralMatrix {
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0, startColumn = 0;
        int endRow = matrix.length - 1, endColumn = matrix[0].length - 1;

        while(startRow <= endRow && startColumn <= endColumn){
            for(int j = startColumn; j <= endColumn; j++){
                System.out.printf("%d ", matrix[startRow][j]);
            }
            startRow++;

            for(int i = startRow; i <= endRow; i++){
                System.out.printf("%d ", matrix[i][endColumn]);
            }
            endColumn--;

            if(startRow <= endRow) {
                for(int j = endColumn; j >= startColumn; j--){
                    System.out.printf("%d ", matrix[endRow][j]);
                }
                endRow--;
            }

            if(startColumn <= endColumn) {
                for(int i = endRow; i >= startRow; i--){
                    System.out.printf("%d ", matrix[i][startColumn]);
                }
                startColumn++;
            }
        }
    }
    public static void main(String[] args) {
        int sample[][] = {
            {1, 2, 3,},
            {4, 5, 6},
            {7, 8, 9},
        };

        spiralMatrix(sample);
    }
}
