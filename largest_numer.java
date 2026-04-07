public class largest_numer {
    public static int largestNumber(int arr[]){
        int largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int arr[] = {23,545,45,77,5,67,55, 5};
        int res = largestNumber(arr);
        System.out.println("largest number in this is array is: " + res);
    }
}
