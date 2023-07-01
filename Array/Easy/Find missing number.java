//Problem LeetCode:#268
//Link="https://leetcode.com/problems/missing-number"
//Brute Force Approach--Using Arrays.sort()
//Time Complexity-O(n*logn)
//Space Complexity--ω(1) 

//----------------------------------------------------------------------------------------------------------------------------------------
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int missing=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        missing=nums.length;
        return missing;
    }
}

//using sum of n natural numbers----------------------------------------------------------------
//Time Complexity-O(n)
//Space Complexity--O(1) 


public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1=((n)*(n+1))/2;
        int sum2=0;
        int missing=0;
        int flag=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                flag=1;
            }
        }
        for(int i=0;i<n;i++){
            sum2+=nums[i];
        }
        if(sum1==sum2 && flag==0)
        return 0;
        else
        missing=sum1-sum2;

        return missing;
}
}
