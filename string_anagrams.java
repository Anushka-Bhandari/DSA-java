import java.util.Scanner;

public class string_anagrams {
    public static boolean anagrams(String str1, String str2){
        StringBuilder s1 = new StringBuilder(str1);
        StringBuilder s2 = new StringBuilder(str2);
        if(s1.length() == s2.length()){
            for(int i=0; i<s1.length(); i++){
                boolean found = false;
                for(int j=0; j<s2.length(); j++){
                    if(s1.charAt(i) == s2.charAt(j)){
                        found = true;
                        s2.deleteCharAt(j);
                        break;
                    }
                }
                if(!found){
                    return false;
                }
            }
            if(s2.length() == 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 2 strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean res = anagrams(str1, str2);
        if(res == true){
            System.out.println("Strings are anagrams of each other");
        }
        else{
            System.out.println("Strings are not anagrams of each other");
        }
        sc.close();
    }
}
