import java.util.*;
public class palindrome_string {
    public static boolean palindrome(String str){
        int i = 0, j = str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = sc.next();
        if(palindrome(str)){
            System.out.println("string is a palindrome");
        }
        else{
            System.out.println("string is not a palindrome");
        }
        sc.close();
    }
}
