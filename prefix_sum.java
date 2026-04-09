public class prefix_sum {
    public static int subArray(int arr[]){
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                current_sum = (i==0) ? prefix[j] : prefix[j] - prefix[i-1];
                if(current_sum > max_sum){
                max_sum = current_sum;
                }
            }
        }
        return max_sum;
    }
    public static void main(String args[]){
        int arr[] = {1, 3, -4, 8, -3};
        int res = subArray(arr);
        System.out.println("maximum subarray sum is: " + res);
    }
}
