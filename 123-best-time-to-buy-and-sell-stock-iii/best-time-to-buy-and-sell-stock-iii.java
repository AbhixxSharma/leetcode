class Solution {
    public int maxProfit(int[] prices) {
       int firstp=Integer.MAX_VALUE;
       int firstprofit=0;
       int secPrice=Integer.MAX_VALUE;
       int secondprofit=0;
       for(int price:prices){
        firstp=Math.min(firstp,price);
        firstprofit=Math.max(firstprofit,price - firstp);
        secPrice=Math.min(secPrice,price-firstprofit);
        secondprofit=Math.max(secondprofit,price-secPrice);

       }
       return secondprofit;

    }
    
}