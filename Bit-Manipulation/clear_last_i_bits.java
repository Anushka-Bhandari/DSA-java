import java.util.*;
public class clear_last_i_bits {
    public static int clearLast_i_bits(int n, int i){
        int bitmask = (~0) << i;
        return n & bitmask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.print("enter number of bits to clear: ");
        int i = sc.nextInt();
        System.out.println(clearLast_i_bits(n, i));
        sc.close();
    }
}
