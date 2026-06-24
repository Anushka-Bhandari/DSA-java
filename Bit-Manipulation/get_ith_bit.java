import java.util.*;
public class get_ith_bit {
    public static int get_ithBit(int n, int i){
        if((n & (1<<i)) == 0){
            return 0;
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n =  sc.nextInt();
        System.out.print("enter the number of bit: ");
        int i = sc.nextInt();
        System.out.println(get_ithBit(n, i));
        sc.close();
    }
}
