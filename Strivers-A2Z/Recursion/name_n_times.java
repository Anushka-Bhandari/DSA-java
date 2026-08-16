import java.util.*;
public class name_n_times{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("enter name: ");
        String name = sc.nextLine();
        name(n, name);
        sc.close();
    }
    public static void name(int n, String name){
        if(n == 0){
            return;
        }
        System.out.println(name);
        name(n-1, name);
    }
}