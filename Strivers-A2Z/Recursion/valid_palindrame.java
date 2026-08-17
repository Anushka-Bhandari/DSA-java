import java.util.*;
public class valid_palindrame {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean res = isPalindrome(s, 0, s.length()-1);
        System.out.println(res);
        sc.close();
    }
    public static boolean isPalindrome(String s, int left, int right){
        while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }
        while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }
        if(left >= right){
            return true;
        }
        if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            return false;
        }
        return isPalindrome(s, left+1, right-1);
    }
}
