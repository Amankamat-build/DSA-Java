package ARRAYSII;

//for getting best day to buy a stock
//best day for selling the stock that maximize profit
// if loss return 0;


public class SellAndBuyStocks {

    public static int BuyAndSellStock(int price[]){
        // we have to initilize a variable to get min value to buy stocks
        int BuyPrice= Integer.MAX_VALUE;
        int MaxProfit=0;

        for(int i=0;i<price.length;i++){
        if(BuyPrice<price[i]){
        int profit= price[i]-BuyPrice;
        MaxProfit= Math.max(MaxProfit, profit);
        }
        else{
           BuyPrice=price[i];
        }
        }
        return MaxProfit;
    }
    public static void main(String[]args){
        int price[]={7, 1, 5, 3, 6, 4};
       System.out.print(BuyAndSellStock(price));
    }
}
