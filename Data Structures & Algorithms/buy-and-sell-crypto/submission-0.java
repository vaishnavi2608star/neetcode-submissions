class Solution {
    public int maxProfit(int[] prices) {
        int mp=0;
        int buyPrice=prices[0];
        for(int i=1;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                mp=Math.max(profit,mp);
            }else{
                buyPrice=prices[i];
            }
        }
        return mp;
    }
}
