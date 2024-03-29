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
