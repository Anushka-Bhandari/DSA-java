public class buySell_stocks_optimal {
    public static int maxProfit(int arr[]){
        int buy_price = Integer.MAX_VALUE;
        int curr_profit = 0, max_profit = 0;
        for(int i=0; i<arr.length; i++){
            if(buy_price < arr[i]){
                curr_profit = arr[i] - buy_price;
                if(curr_profit > max_profit){
                    max_profit = curr_profit;
                }
            }
            else{
                buy_price = arr[i];
            }
        }
        return max_profit;
    }
    public static void main(String args[]){
        int price[] = {7, 1, 5, 3, 6, 4};
        int res = maxProfit(price);
        System.out.println("maximu profit is: " + res); 
    }
}
