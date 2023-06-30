//Problem Link:
//" https://leetcode.com/problems/move-zeroes/"
//Brute Force Approach --Using AN auxillary/temp array
//Time Complexity --O(n)
//Space Complexity --O(n)

class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int nums1[]=new int[n];
         if(n==1)
            return;
             int j=0;
            int k=n;
        for(int i=0;i<n;i++){
           
            if(nums[i]!=0){
            nums1[j]=nums[i];
            j++;
            }
            else{
                nums1[k-1]=nums[i];
                k--;
            }
        }

        for(int i=0;i<n;i++){
            nums[i]=nums1[i];
        }
        
    }
}

// Optimal Approach using Constant Space Complexity
//Time Complexity --O(2*n)
//Space Complexity --O(1)
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1)
        return;
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
       
         
        
    }
}
  
