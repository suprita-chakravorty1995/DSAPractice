import java.util.*;
public class Solution {
    public static List<Long> factorialNumbers(long n) 
    {
        List<Long> vals = new ArrayList<Long>();
        getFacts(1,1,n,vals);
        return vals;
    }

    private static void getFacts(long i, long fact, long n, List<Long> vals)
    {
        i++;
        if(fact > n)
        {
            return;
        }
        vals.add(fact);
        getFacts(i,fact*i,n,vals);
    }
}
