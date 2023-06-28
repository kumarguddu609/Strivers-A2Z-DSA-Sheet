//Problem link: 
// "https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array"




//Brute Force Approach-  O(n*log(n))--Time Complexity
//                        O(n)-- Space Complexity
//Note: Always use same file name as class name

class solution {
    
    public int largest(int arr[], int n)
    {
        Arrays.sort(arr); //sorting array in ascending order
        int k=arr[n-1];
        return k;
        
    }
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Optimal Approach--Using a max variable
// O(n) --Time Complexity
//O(1) --Space Compelexity

import java.util.*;
public class solution {
  static int findLargestElement(int arr[]) {
    int max= arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max= arr[i];
      }
    }
    return max;
  }
}

