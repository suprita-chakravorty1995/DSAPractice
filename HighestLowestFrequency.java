import java.util.*;
public class Solution {
    public static int[] getFrequencies(int []v) {
       Map<Integer,Integer> map = new TreeMap<>();
       for(int i : v)
       {
           map.compute(i, (key,value) -> 
                    (value == null) ? 1 : value+1);
       }

       int minFreq = Integer.MAX_VALUE;
       int maxFreq = Integer.MIN_VALUE;
       int minEle = 0, maxEle = 0;

       for(Map.Entry<Integer,Integer> entry : map.entrySet())
       {
           int value = entry.getValue();
           int key = entry.getKey();

           if(value < minFreq)
           {
               minEle = key;
               minFreq = value;
           }

           if(value > maxFreq)
           {
               maxEle = key;
               maxFreq = value;
           }
       }

       int[] arr = new int[2];
       arr[0] = maxEle;
       arr[1] = minEle;
       return arr;


    }
}
