

/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */
// @lc code=start
// class Solution {
//     public int maxProfit(int[] prices) {
//         int n=prices.length;
//         int max=0;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 int profit=prices[j]-prices[i];
//                 if(profit>max){
//                     max=profit;
//                 }           
//             }
//         }
//         return max;
//     }
// }
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minsofar=prices[0];
        int n=prices.length;
        for(int i=1;i<n;i++){
            minsofar=Math.min(minsofar,prices[i]);
            int Profit=prices[i]-minsofar;
            maxProfit=Math.max(maxProfit,Profit);
        }
        return maxProfit;
    }
}
// @lc code=end

