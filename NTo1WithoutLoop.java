public class Solution
{
    public static int[] printNos(int x) {
        int[] nums = new int[x];
        printNums(x,x,nums);
        return nums;
    }

    private static void printNums(int i,int n, int[] nums)
    {
        if(i == 0)
        {
            return;
        }
        nums[n-i] = i;
        i--;
        printNums(i,n,nums);
    }
}
