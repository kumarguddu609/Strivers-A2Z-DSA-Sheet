//Problem Link:
//"https://leetcode.com/problems/remove-duplicates-from-sorted-array/"

//Remove Duplicates from Sorted Array
// Time Complexity-- O(n)
//Space Complexity-- O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
         int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
        
    }
}
