import java.util.*;
public class odd_even{
    public static void oddEven(int n){
        if((n & 1) == 0){
            System.out.println(n + " is even number");
        }
        else{
            System.out.println(n + " is odd number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        oddEven(n);
        sc.close();
    }
}