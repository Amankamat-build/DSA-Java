package ARRAYSII;

public class BuyAndSellStocks {

    public static int BuyAndSellGetProfit(int price[]){
        int BuyPrice= Integer.MAX_VALUE; // for getting min buy value
        int MaxProfit=0; 
        for(int i=0;i<price.length;i++){
            if(BuyPrice<price[i]){
                int profit= price[i] - BuyPrice; // for getting profit
                MaxProfit= Math.max(MaxProfit,profit);
            }
            else{
                BuyPrice=price[i]; // did wrong here if that not true then buyprice=price.a
            }
        }
        return MaxProfit;
    }
    
    public static void main(String[]args){
        int price[]={7,1,5,3,6,4};
        System.out.println(BuyAndSellGetProfit(price));
    }
}
