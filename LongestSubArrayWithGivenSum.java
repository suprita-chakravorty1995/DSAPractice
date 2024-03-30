public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) 
    {
        int left = 0, right = 0;
        int n = a.length;
        long sum = a[0];
        int len = 0;
        while(right < n)
        {
            while(left <= right && sum > k)
            {
                sum -= a[left];
                left++;
            }

            if(sum == k)
            {
                len = Math.max(len, (right-left) + 1);
            }

            right++;
            if(right < n)
            {
                sum += a[right];
            }
            
        }

        return len;
    }
}
