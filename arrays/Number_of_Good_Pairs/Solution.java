// Problem: Number of Good Pairs
// LeetCode: https://leetcode.com/problems/number-of-good-pairs/
// Difficulty: Easy
// Topic: Arrays , Counting, HashMap


package arrays.Number_of_Good_Pairs;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int out=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    out++;
                }
            }
        }
        return out;
    }
}
