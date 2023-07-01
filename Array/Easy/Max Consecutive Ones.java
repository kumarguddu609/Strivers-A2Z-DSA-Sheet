//Problem LeetCode: #485
//Link:"https://leetcode.com/problems/max-consecutive-ones/"

//Time Complexity-O(n)
//Space Complexity--O(1) 

//--------------------------------------------------------------------------------------------------------------------------------------------
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max_count=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=1)
            count=0;
            else
            count++;
            if(max_count<count){
                max_count=count;
            }
        }
        return max_count;
    }
}
