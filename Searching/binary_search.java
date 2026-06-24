public class binary_search {
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }
            if(arr[mid] > key){
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 6, 8, 9};
        int key = 6;
        int res = binarySearch(arr, key);
        if(res == -1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at index: " + res);
        }
    }
}
