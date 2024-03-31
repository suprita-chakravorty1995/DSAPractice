/*
Problem statement
Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, 
where 'k' is non-negative.



Example:
'arr '= [1,2,3,4,5]
'k' = 1  rotated array = [2,3,4,5,1]
'k' = 2  rotated array = [3,4,5,1,2]
'k' = 3  rotated array = [4,5,1,2,3] and so on.

*/

import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) 
    {
        if(k == 0)
        {
            return arr;
        }
        int n = arr.size();
        k = k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        return arr;
    }

    private static void reverse(ArrayList<Integer> arr, int low, int high)
    {
        while(low < high)
        {
            int temp = arr.get(high);
            arr.set(high,arr.get(low));
            arr.set(low,temp);
            low++;
            high--;
        }
    }
}
