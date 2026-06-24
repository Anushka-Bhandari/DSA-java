import java.util.*;
public class search_matrix {
    public static int search7(int matrix[][]){
        int count = 0; 
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 7){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("enter number of columns: ");
        int m = sc.nextInt();
        System.out.println("enter " + n*m + " elements: ");
        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int res = search7(matrix);
        System.out.println("number of 7's in the 2d array is : " + res);
        sc.close();
    }
}
