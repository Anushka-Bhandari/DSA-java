public class max_subarray_sum_brute_force {
    public static int subarray(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                current_sum = 0;
                for(int k=i; k<=j; k++){
                    current_sum += arr[k];
                }
                if(current_sum > max_sum){
                    max_sum = current_sum;
                }
            }
        }
        return max_sum;
    }
    public static void main(String args[]){
        int arr[] = {1,-5, 6, 3, 0};
        int res = subarray(arr);
        System.out.println("max subarray sum is: " + res);
    }
}
