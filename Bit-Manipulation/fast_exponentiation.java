import java.util.*;
public class fast_exponentiation {
    public static int exponentiation(int n, int i){
        int ans = 1;
        while(i > 0){
            if((i & 1) != 0){
                ans *= n;
            } 
            n = n * n;
            i = i >> 1;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.print("enter power: ");
        int i = sc.nextInt();
        System.out.println(exponentiation(n, i));
        sc.close();
    }
}
