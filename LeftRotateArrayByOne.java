import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) 
    {
        int first = arr[0];
        for(int i = 1; i<n; i++)
        {
            arr[i-1] = arr[i];
        }

        arr[n-1] = first;
        return arr;

    }
}
