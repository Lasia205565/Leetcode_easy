/*
  题目：买卖股票的最佳时间
         给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
         如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
         注意你不能在买入股票前卖出股票。
*/

/**code-finished_firstly**/

class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int max=0;
        for(int i=0;i<len-1;i++)
        {
            int elem = prices[i];
            for(int j=i+1;j<len;j++)
            {
                if(prices[j]-prices[i]>max)
                {
                    max=prices[j]-prices[i];
                }
            }
        }
        return max;
    }
}

/**code-provided_by_leetcode/

public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
