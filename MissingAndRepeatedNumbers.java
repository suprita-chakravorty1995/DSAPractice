import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) 
    {
        long sn = (n * (n+1)) / 2;
        long s2n = (n * (n+1) * (2*n+1)) / 6;

        long s = 0, s2 = 0;
        for(int i=0; i<n; i++)
        {
            int val = arr.get(i);
            s += val;
            s2 += val * val;
        }

        long val1 = s-sn;
        long val2 = s2-s2n;

        val2 = val2/val1;
        long x = (val1 + val2)/2;
        long y = x - val1;
        int[] res = {(int) y,(int) x};
        return res;

    }
}
