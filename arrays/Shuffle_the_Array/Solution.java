// Problem: Shuffle the Array
// LeetCode: https://leetcode.com/problems/shuffle-the-array/
// Difficulty: Easy
// Topic: Arrays , Simulation


package arrays.Shuffle_the_Array;
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result=new int[2*n];
        int p1=0;
        int p2=n;
        int i=0;
        while(p1<n && p2<2*n){
            result[i++]=nums[p1++];
            result[i++]=nums[p2++];
        }
        return result;
    }
}
