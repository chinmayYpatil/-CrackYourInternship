/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int newarr=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[newarr]=nums[i];
                newarr++;
            }
        }
        return newarr;
    }
}
// @lc code=end

