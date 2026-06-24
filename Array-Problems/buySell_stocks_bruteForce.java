public class buySell_stocks_bruteForce {
    public static int profit(int arr[]){
        int max_profit = 0; 
        int curr_profit = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                curr_profit = arr[j] - arr[i];
                if(curr_profit > max_profit){
                    max_profit = curr_profit;
                }
            }
        }
        return max_profit;
    }
    public static void main(String args[]){
        int price[] = {7, 1, 5, 3, 6, 4};
        int res = profit(price);
        System.out.println("maximum profit is: " + res);
    }
}
