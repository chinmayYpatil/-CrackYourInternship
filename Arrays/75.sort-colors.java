/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
// class Solution {
//     public void sortColors(int[] nums) {
//         int n=nums.length;
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){
//                 if(nums[j]>nums[j+1]){
//                     int temp=nums[j];
//                     nums[j]=nums[j+1];
//                     nums[j+1]=temp;
//                 }
//             }
//         }
//     }
// }
class Solution {
    public void sortColors(int[] nums) {
        int countr=0;
        int countw=0;
        int countb=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                countr++;
            }
            else if(nums[i]==1){
                countw++;
            }
            else if(nums[i]==2){
                countb++;
            }
        }
        int newarr=0;
        for(int i=0;i<countr;i++){
            nums[newarr++]=0;
        }
        for(int i=0;i<countw;i++){
            nums[newarr++]=1;
        }
        for(int i=0;i<countb;i++){
            nums[newarr++]=2;
        }
    }
}
// @lc code=end

