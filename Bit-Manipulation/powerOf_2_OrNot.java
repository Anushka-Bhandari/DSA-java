import java.util.*;
public class powerOf_2_OrNot {
    public static void check(int n){
        if((n & (n-1)) == 0){
            System.out.println(n + " is power of 2");
        }
        else{
            System.out.println(n + " is not power of 2");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        check(n);
        sc.close();
    }
}
