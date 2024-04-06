import java.util.*;
public class Solution {
    public static int[][] pascalTriangle(int N) 
    {
        int[][] res = new int[N][];
        List<Integer> prev = new ArrayList<Integer>();

        for(int i=0;i<N; i++)
        {
            int[] row = new int[i+1];
            for(int j=0; j<=i; j++)
            {
                if(j==0 || j==i)
                {
                    row[j] = 1;
                }
                else
                {
                    row[j] = prev.get(j-1) + prev.get(j);
                }

            }

            res[i] = row;
            prev = new ArrayList<>();

            for (int val : row)
            {
                prev.add(val);
            }

        }
        
        return res;
        
    }
}
