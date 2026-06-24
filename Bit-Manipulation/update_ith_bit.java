import java.util.*;
public class update_ith_bit {
    public static int updateIthBit(int n, int i, int set){
        if(set == 0){
            int bitmask = ~(1 << i);
            return n & bitmask;
        }
        else{
            int bitmask = 1 << i;
            return n | bitmask;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.print("enter number of bit to update: ");
        int i = sc.nextInt();
        System.out.print("enter set bit(0 or 1): ");
        int set = sc.nextInt();
        System.out.println(updateIthBit(n, i, set));
        sc.close();
    }
}
