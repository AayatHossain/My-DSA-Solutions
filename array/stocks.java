public class stocks {
    public static int profit(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;
        for(int i = 0; i < price.length; i++){
            if(buyPrice < price[i]){
                profit = price[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};
        System.out.println(profit(price));
    }
}
