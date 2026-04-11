public class countingSort_desc {
    public static void counting_desc(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int index = 0;
        for(int i=count.length-1; i>=0; i--){
            while(count[i] > 0){
                arr[index++] = i;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        counting_desc(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
