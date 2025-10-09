package Arrays_Easy_Medium_Hard;

public class StockBuyAndSell {
    public void stockBuyAndSell(int[] num){

        int min = num[0];
        int profit = 0;

        for (int i = 1; i < num.length; i++) {
            int cost = num[i] - min;
            profit = Math.max(cost, profit);
            min = Math.min(num[i], min);
        }

        System.out.println(profit);
    }
}
