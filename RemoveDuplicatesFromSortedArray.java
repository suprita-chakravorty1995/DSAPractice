class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int n = nums.length;
        int currIndex = 1;
        int currElement = nums[0];

        for(int i=1; i<n; i++)
        {
            if(nums[i] == currElement)
            {
                continue;
            }
            else
            {
                currElement = nums[i];
                swap(nums,i,currIndex);
                currIndex++;
            }
        }

        return currIndex; 
    }

    private static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
