import java.util.*;
public class uppercase_to_lowercase {
    public static char conversion(char ch){
        return (char)(ch | ' ');
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("lowercase: " + conversion(ch));
        sc.close();
    }
}
