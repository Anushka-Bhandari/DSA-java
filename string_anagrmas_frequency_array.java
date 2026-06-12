import java.util.*;
public class string_anagrmas_frequency_array {
    public static boolean stringAnagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int frequency[] = new int[26];
        for(int i=0; i<str1.length(); i++){
            frequency[str1.charAt(i) - 'a']++;
            frequency[str2.charAt(i) - 'a']--;
        }
        for(int i=0; i<frequency.length; i++){
            if(frequency[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean res = stringAnagrams(str1, str2);
        if(res){
            System.out.println("Strings are anagrams");
        }
        else{
            System.out.println("Strings are not anagrams");
        }
        sc.close();
    }
}
