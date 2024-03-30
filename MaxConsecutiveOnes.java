class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int max = 0;
        int currCount = 0;
        int n = nums.length;

        for(int i=0; i<n; i++)
        {
            if(nums[i] == 0)
            {
                currCount = 0;
                continue;
            }
            else
            {
                currCount++;
                if(currCount > max)
                {
                    max = currCount;
                }
            }
        }

        return max;

    }
}
