import java.util.*;
public class Solution {
    public static List<String> printNtimes(int n)
    {
        List<String> names = new ArrayList<String>();
        printNtimes(n,names);
        return names;
    }

    private static void printNtimes(int n, List<String> names)
    {
        if(n == 0)
        {
            return;
        }
        names.add("Coding Ninjas");
        n--;
        printNtimes(n,names);
    }
}
