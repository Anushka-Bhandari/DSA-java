public class string_compression {
    // for loop approach 
    public static String compression(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int count = 1;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                if(count > 1){
                    sb.append(count);
                }
                sb.append(str.charAt(i));
                count = 1;
            }
        }
        
        if(count > 1){
            sb.append(count);
        }
        return sb.toString();
    }
    // while loop approach (batch - processing)
    public static String compress(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            int count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                // this i points to the last character of one group when the loop exits and i in for loop moves to the next group
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "aaabbcccdd";
        // output and time complexity is same for both, while loop is just clearly expressing the pattern
        System.out.println("compressed string: " + compression(str));
        System.out.println("compressed string(while loop): " + compress(str));
    }
}
