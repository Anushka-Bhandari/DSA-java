public class search_sortedMatrix {
    public static void search(int matrix[][], int key){
        int startRow = 0, startCol = matrix[0].length - 1;
        while(startRow < matrix.length && startCol >= 0){
            if(matrix[startRow][startCol] == key){
                System.out.println(key + " is at: " + "( " + startRow + ", " + startCol + " )");
                return;
            }
            else if(key < matrix[startRow][startCol]){
                startCol--;
            }
            else if(key > matrix[startRow][startCol]){
                startRow++;
            }
        }
        System.out.println("key not found");
    }
    public static void main(String args[]){
        int matrix[][] = {{10, 20, 30, 40}, 
                          {15, 25, 35, 45}, 
                          {27, 29, 37, 48}, 
                          {32, 33, 39, 50}};
        int key = 33;
        search(matrix, key);
    }
}
