import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) 
    {
        int aLen = a.length;
        int bLen = b.length;
        List<Integer> result = new ArrayList<Integer>();

        int i=0, j=0;

        while(i<aLen && j<bLen)
        {
            if(a[i] <= b[j])
            {
                if(result.size() == 0 || result.get(result.size()-1) != a[i])
                {
                    result.add(a[i]);
                }
                i++;
            }
            else
            {
                if(result.size() == 0 || result.get(result.size()-1) != b[j])
                {
                    result.add(b[j]);
                }
                j++;
            }
        }

        while(i < aLen)
        {
            if(result.get(result.size()-1) != a[i])
            {
                    result.add(a[i]);
            }
            i++;
        }

        while(j < bLen)
        {
            if(result.get(result.size()-1) != b[j])
            {
                    result.add(b[j]);
            }
            j++;
        }

        return result;
        
    }
}
