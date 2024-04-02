class Solution {
    public boolean canJump(int[] nums) 
    {
        // GreedyApproach :
        // Consider FinalPosition as LastIndex
        // Now, traverse back and see 
        // if you are able to reach the finalPosition
        // If Yes, update your final position
        // using that index

        int finalPosition = nums.length - 1;
        for(int idx = nums.length - 2; idx >= 0; idx--)
        {
            if(idx + nums[idx] >= finalPosition)
            {
                finalPosition = idx;
            }
        }

        return finalPosition == 0;
        
    }
}
