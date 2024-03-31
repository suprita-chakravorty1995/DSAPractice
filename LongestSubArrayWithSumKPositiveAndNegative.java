import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) 
	{
		int len = 0, sum = 0;
		int n = nums.length;
		Map<Integer,Integer> sumMap = new HashMap<Integer,Integer>();
		for(int i=0; i<n; i++)
		{
			sum += nums[i];

			if(sum == k)
			{
				len = Math.max(len, i+1);
			}

			int rem = sum - k;
			
			if(sumMap.containsKey(rem))
			{
				len = Math.max(len,i- sumMap.get(rem));
			}

			if(!sumMap.containsKey(sum))
			{
				sumMap.put(sum, i);
			}
		}

		return len;
	}
}
