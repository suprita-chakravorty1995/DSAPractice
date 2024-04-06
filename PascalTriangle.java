import java.util.*;
public class Solution {
    public static int[][] pascalTriangle(int N) 
    {
          int[][] res = new int[N][];

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
                    row[j] = res[i-1][j-1] + res[i-1][j];
                }

            }

            res[i] = row;

        }
        
        return res;
        
    }
}
