import java.util.*;
public class matrix_smallest {
    public static void smallest(int matrix[][]){
        Integer smallest = null;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(smallest == null || matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("smallest emement is: " + smallest);
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
        smallest(matrix);
        sc.close();
    }
}
