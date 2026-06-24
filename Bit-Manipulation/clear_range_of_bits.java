import java.util.*;
public class clear_range_of_bits {
    public static int clearRangeOfBits(int n, int i, int j){
        int a = (~0) << j+1;
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.print("enter range: ");
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(clearRangeOfBits(n, i, j));
        sc.close();
    }
}
