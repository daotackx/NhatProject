
public class ListNode {
    public static void main(String[] args) {
        // int n[] = {};
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int profitMax = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    profit = prices[j] - prices[i];
                    if (profit > profitMax) {
                        profitMax = profit;
                    }
                }
            }

        }
        return profitMax;
    }

}
