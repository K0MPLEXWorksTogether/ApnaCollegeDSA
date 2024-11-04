public class SearchInSortedMatrix {
    public static int[] staircaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length - 1;
        int result[] = new int[2];

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                result[0] = row;
                result[1] = col;

                return result;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }

        result[0] = -1;
        result[1] = -1;
        return result;
    }

    public static void main(String[] args) {
        int sample[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50},
        };

        int answer[] = staircaseSearch(sample, 33);
        System.out.println("Row: " + answer[0] + " Col: " + answer[1]);
    }
}
