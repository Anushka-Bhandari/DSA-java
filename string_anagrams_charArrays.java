import java.util.*;
public class string_anagrams_charArrays {
    public static boolean check_anagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean res = check_anagrams(str1, str2);
        if(res){
            System.out.println("Strings are anagrams");
        }
        else{
            System.out.println("Strings are not anagrams");
        }
        sc.close();
    }
}
