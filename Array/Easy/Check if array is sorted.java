//Problem link:
// "https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?"

// Time Complexity-- O(n)
//Space Complexity-- O(1)
class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        
        boolean isSort=false;
        if(n==1)
        return true;
        for(int i=1;i<n;i++){
            if(arr[i-1]<=arr[i]){
                isSort=true;
            }
            else{
                return false;
            }
        }
        return isSort;
    }
}

//Check if Array Is Sorted and Rotated
//"https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/"
// Time Complexity-- O(n)
//Space Complexity-- O(1)

class Solution {
    public boolean check(int[] nums) {
        int n=nums.length-1;
        boolean sort=false;
        int flag=0;          //flag variable to check that at which element the array is rotated
        if(nums[0]>=nums[n-1]){
            sort=true;
        }

        for(int i=0;i<n;i++){
            if(nums[i]>nums[i+1])
            {
                flag++;
            }
            
        }
       
        if(sort==true && flag==1 || flag==0){
            return true;
        }
        return false;
    }
    
}


