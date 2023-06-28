//Problem Link:
// "https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest"

class Solution {
    int print2largest(int arr[], int n) {
        if(n==0 || n==1)
        return -1;
        int largest=-1;
        int sec_largest=-1;
        int count=n;
        
        for(int i=0;i<n;i++){
            if (arr[i] > largest)
		{
			sec_largest = largest;
			largest = arr[i];
		}

		else if (arr[i] > sec_largest && arr[i] != largest)
		{
			sec_largest = arr[i];
		}
	    count--;
        }
     
       return sec_largest;
      
    }
    
}
