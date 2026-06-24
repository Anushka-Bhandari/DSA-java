public class string_comparison_lexicographically{
    public static String comparison(String arr[]){
        String largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i].compareToIgnoreCase(largest) > 0){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        String fruits[] = {"apple", "mango", "banana"};
        System.out.println("lexicographically largest string is: " + comparison(fruits));
    }
}