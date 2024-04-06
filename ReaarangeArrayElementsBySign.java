class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int posIndex = 0, negIndex = 1;
        int n = nums.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++)
        {
            if(nums[i] < 0)
            {
                res[negIndex] = nums[i];
                negIndex += 2;
            }
            if(nums[i] > 0)
            {
                res[posIndex] = nums[i];
                posIndex += 2;
            }
        }

        return res;
        
    }
}
