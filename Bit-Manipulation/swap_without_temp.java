import java.util.*;
public class swap_without_temp {
    public static void swap(int a, int b){
        System.out.println("values before swapping : a=" + a + " b=" + b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("values after swapping: a=" + a + " b=" + b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a, b);
        sc.close();
    }
}
