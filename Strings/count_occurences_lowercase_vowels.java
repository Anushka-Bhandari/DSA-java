import java.util.*;
public class count_occurences_lowercase_vowels {
    public static int countOccurences(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i); 
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = sc.nextLine();
        System.out.println("number of times lowercase vowels occured is: " + countOccurences(str));
        sc.close();
    }
}
