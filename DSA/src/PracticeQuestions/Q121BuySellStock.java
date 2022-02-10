package PracticeQuestions;

public class Q121BuySellStock {
    public int maxProfit(int[] prices) {
        int min=0;
        int profit=0;


        for (int i=0; i<prices.length; i++){
            if (i==0)
                min = prices[i];
            else if (min>prices[i])
                    min=prices[i];
            else if (prices[i]-min>profit)
                profit=prices[i]-min;
           }

        return profit;
    }
    public static void main(String[] args){
        int[] prices={1,2,4,2,5,7,2,4,9,0,9};
        Q121BuySellStock bss=new Q121BuySellStock();
        int profit=bss.maxProfit(prices);
        System.out.println(profit);
    }
}
