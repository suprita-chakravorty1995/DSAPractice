public class Solution {
    public static int[] reverseArray(int n, int []nums) 
    {
        reverse(nums, 0,n-1);
        return nums;
    }

    private static void reverse(int[] nums, int start, int end)
    {
        if(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            reverse(nums, start+1, end-1);
        }
    }
}
