/** 
    题目：
       给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
       设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
       注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
**/

/**code-finished_after_watch_answers**/


/*
Method1:峰谷法
        关键是我们需要考虑到紧跟谷的每一个峰值以最大化利润。
        如果我们试图跳过其中一个峰值来获取更多利润，那么我们最终将失去其中一笔交易中获得的利润，从而导致总利润的降低。
        
        所以要记录每一对连续的峰值（peak）和谷值（valley），在谷值时买入，在峰值时卖出。
*/
class Solution {
    public int maxProfit(int[] prices) {
     int len = prices.length;
        if(len==0||prices==null)
            return 0;
        int valley=prices[0];
        int peak = prices[0];
        int max=0;
     for(int i=0;i<len-1;i++)
     {
         while(i<len-1&&prices[i]>=prices[i+1])
         {
             i++;
         }
         valley=prices[i]; /*谷值*/
         while(i<len-1&&prices[i]<=prices[i+1])
         {
             i++;
         }
         peak=prices[i];/*峰值*/
         max+=peak-valley;
     }
        return max;
    }
}

/*
    Method2:简单的一次遍历 /逻辑较为复杂
    
    遵循峰谷法的本身使用的逻辑，但有一些轻微的变化。
    在这种情况下，我们可以简单地继续在斜坡上爬升并持续增加从连续交易中获得的利润，而不是在谷之后寻找每个峰值。
    最后，我们将有效地使用峰值和谷值，但我们不需要跟踪峰值和谷值对应的成本以及最大利润，但我们可以直接继续增加加数组的连续数字之间的差值，如果第二个数字大于第一个数字，我们获得的总和将是最大利润。
    
*/
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
