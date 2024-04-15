class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        left[0] = 1;
        for(int i=1; i<nums.length; i++)
        {
            left[i] = left[i-1] * nums[i-1];
        }

        int n = nums.length;
        right[n-1] = 1;
        for(int i=nums.length-2; i>=0; i--)
        {
            right[i] = right[i+1] * nums[i+1];
        }

        int[] result = new int[nums.length];
        for(int i=0; i<n; i++)
        {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}
