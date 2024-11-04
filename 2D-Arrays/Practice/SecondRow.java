package Practice;

public class SecondRow {
    public static void printSecondRow(int matrix[][]){
        if(matrix.length < 2){
            System.out.println();
        }

        for(int j = 0; j < matrix[0].length; j++){
            System.out.printf("%d ", matrix[1][j]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int sample[][] = {
            {1, 4, 9},
            {11, 4, 3},
            {2, 2, 3}
        };
        printSecondRow(sample);
    }
}
