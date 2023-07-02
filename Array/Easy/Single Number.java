//LeetCode: #136
//Problem link:
// "https://leetcode.com/problems/single-number/"

// Time Complexity-- O(n^2)
//Space Complexity-- O(1)
//
import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
      int n=nums.length;

      for(int i=0;i<n;i++){
          int num=nums[i];
          int count =0;
          for(int j=0;j<n;j++){
              if(nums[j]==num)
              count++;
          }
          if(count ==1) return num;
      }
        return -1;
    }
}
