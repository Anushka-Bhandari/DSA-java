import java.util.*;
public class matrix_largest {
    public static void largest(int matrix[][]){
        Integer largest = null; 
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(largest == null || matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("largest element is: " + largest);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        System.out.println("enter elements: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        largest(matrix);
        sc.close();
    }
}
