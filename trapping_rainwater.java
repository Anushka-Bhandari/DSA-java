public class trapping_rainwater {
    public static int trapped_water(int arr[]){
        if(arr.length <= 2){
            return 0;
        }
        int trapped_water = 0;
        Integer water_level = null;
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        left[0] = arr[0];
        right[right.length-1] = arr[arr.length-1];
        for(int i=1; i<arr.length; i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        for(int i=arr.length-2; i>=0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            water_level = Math.min(left[i], right[i]);
            trapped_water += water_level - arr[i];
        }
        return trapped_water;
    }
    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int res = trapped_water(height);
        System.out.println("volume of total trapped rainwater is:  " + res);
    }
}
