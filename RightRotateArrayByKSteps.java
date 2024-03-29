class Solution {
    public void rotate(int[] nums, int k) 
    {
        if(k == 0)
        {
            return;
        }
        
        int n = nums.length;
        k = k % n;

        reverse(nums,0, n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1); 
    }

    private static void reverse(int[] arr, int low, int high)
    {
        while(low < high)
        {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }
    }
}
