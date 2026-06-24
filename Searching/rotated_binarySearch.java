import java.util.*;
public class rotated_binarySearch {
    public static int target_index(int nums[], int target){
        int s = 0, e = nums.length - 1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(nums[s] <= nums[mid]){
                if(target >= nums[s] && target < nums[mid]){
                    e = mid -1;
                }
                else{
                    s = mid + 1;
                }
            }
            else{
                if(target > nums[mid] && target <= nums[e]){
                    s = mid + 1;
                }
                else{
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("enter values of array: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("enter target value: ");
        int target = sc.nextInt();
        System.out.println("index of target is: " + target_index(nums, target));
        sc.close();
    }
}
