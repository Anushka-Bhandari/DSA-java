import java.util.*;
public class transpose_matrix {
    public static int[][] transpose(int matrix[][]){
       int row = matrix.length, column = matrix[0].length;
       int trans[][] = new int[column][row];
       for(int i=0; i<row; i++){
        for(int j=0; j<column; j++){
            trans[j][i] = matrix[i][j];
        }
       }
       return trans;
    }
    public static void print(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("enter number of columns: ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("enter " + n*m + " elements: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        print(transpose(matrix));
        sc.close();
    }
}
