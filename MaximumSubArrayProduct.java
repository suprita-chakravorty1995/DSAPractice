class Solution {
    public int maxProduct(int[] nums) 
    {
        int maxProduct = 0;
        int currProduct = 1;

        if(nums.length == 1)
        {
            return nums[0];
        }

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != 0)
            {
                currProduct = currProduct * nums[i];
                maxProduct = Math.max(maxProduct,currProduct);
            }
            else
            {
                currProduct = 1;
            }
        }

        currProduct = 1;

        for(int i=nums.length -1 ; i>=0; i--)
        {
            if(nums[i] != 0)
            {
                currProduct = currProduct * nums[i];
                maxProduct = Math.max(maxProduct,currProduct);
            }
            else
            {
                currProduct = 1;
            }
        }

        return maxProduct;

        
    }
}
