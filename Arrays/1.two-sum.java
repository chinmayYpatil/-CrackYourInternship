/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] newarr=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i+1;j++){
                if(nums[i]+nums[j]==target){
                    newarr[0]=i;
                    newarr[1]=j;
                    break;
                }
            }
        }
        return null;
    }
}
// @lc code=end

