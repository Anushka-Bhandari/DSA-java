import java.util.Arrays;
public class inbuilt_sort_asc {
    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr, 0, 3);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
