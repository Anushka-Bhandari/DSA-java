import java.util.*;
public class set_ith_bit {
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.print("enter the number of bit to set: ");
        int i = sc.nextInt();
        System.out.println(setIthBit(n, i));
        sc.close();
    }
}
