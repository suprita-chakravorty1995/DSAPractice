class Solution {
    public int majorityElement(int[] nums) 
    {
        int n = nums.length;
        int count=0, element = 0;
        for(int i=0; i<n; i++)
        {
            if(count == 0)
            {
                count = 1;
                element = nums[i];
            }
            else if(nums[i] != element)
            {
                count --;
            }
            else
            {
                count ++;
            }
        }

        return element;
        
    }
}
