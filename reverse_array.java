public class reverse_array {
    public static int[] reverseArray(int arr[]){
        for(int i=0, j=arr.length-1; i<j ; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[] = {2,4,575,65,4,655,5445,67,6,834};
        reverseArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
