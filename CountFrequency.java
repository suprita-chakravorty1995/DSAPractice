import java.util.*;

public class Solution {
    public static int[] countFrequency(int n, int x, int []nums)
    {
        Map<Integer,Integer> freqMap = new HashMap<Integer,Integer>();
        for(int i : nums)
        {
             freqMap.compute(i, (key, value) -> 
             (value == null) ? 1 : value + 1);

        }

        int[] res = new int[n];
        for(int i=1; i<=n; i++)
        {
            res[i-1] = freqMap.getOrDefault(i,0); 
        }

        return res;

    }
}
