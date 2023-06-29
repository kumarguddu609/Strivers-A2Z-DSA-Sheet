//Problem-Link:
//" https://leetcode.com/problems/rotate-array/ "

//Brute Force Approach --Using Extra space for auzillary array
// Time Complexity -- O(3*n)

class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int nums1[]=new int[n];
        for(int i=0;i<n;i++){
            nums1[i]=nums[i];
        }
        if (nums == null || n == 0 || n==1) {
            return;
        }
        if(n<k){
           k=k%n;
        }
        for(int i=0;i<k;i++){
            nums[i]=nums1[n-k+i];
        }
        int j=0;
        for(int i=k;i<n;i++){
            nums[i]=nums1[j];
            j++;
        }
       
    }
}


//Optimal Approch by reversing the array
//Time complexity:O(N)
//Space complexity:cO(1)

class Solution {

    public static void reverse(int nums[], int start, int end){
    // While start index is less than end index
    while(start < end){
        // Swap elements at start and end indices
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        // Increment start index and decrement end index
        start++;
        end--;
    }
}

    public void rotate(int[] nums, int k) {
        // Ensure k is within array bounds
        k %= nums.length;
        // Reverse entire array
        reverse(nums, 0, nums.length - 1);
        // Reverse first k elements
        reverse(nums, 0, k - 1);
        // Reverse remaining elements
        reverse(nums, k, nums.length - 1);
    }
}
