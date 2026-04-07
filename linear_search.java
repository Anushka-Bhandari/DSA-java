public class linear_search{
    public static int linearSearch(int key, int arr[]){
        int index_found =  -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                index_found = i;
                break;
            }
        }
        return index_found;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 45, 566, 38, 48, 328};
        int key = 48;
        int res = linearSearch(key, arr);
        if(res == -1){
            System.out.println("element not found");
        }
        else{
            System.out.println(key + " found at index: " + res);
        }
    }
}