import java.util.*;
public class sum_2ndRow_matrix {
    public static int sum(int nums[][]){
        int sum = 0;
        if(nums.length < 2){
            return 0;
        }
        for(int j=0; j<nums[1].length; j++){
            sum += nums[1][j];
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("enter number of columns: ");
        int m = sc.nextInt();
        int nums[][] = new int[n][m];
        System.out.println("enter " + n*m + " elements: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        int res = sum(nums);
        System.out.println("sum of the number in the second row is: " + res);
        sc.close();
    }
}
