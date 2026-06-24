import java.util.*;
public class clear_ith_bit {
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1 << 1);
        return n & bitmask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.print("enter the number of bit to clear: ");
        int i = sc.nextInt();
        System.out.println(clearIthBit(n, i));
        sc.close();
    }
}
