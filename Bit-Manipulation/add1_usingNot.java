import java.util.*;
public class add1_usingNot {
    public static int add1(int n){
        return -~n;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.println("number after adding 1 is: " + add1(n));
        sc.close();
    }
}
