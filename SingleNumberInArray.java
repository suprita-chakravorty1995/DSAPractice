class Solution {
    public int singleNumber(int[] nums) 
    {

        //1. XOR of two same numbers is always 0 i.e. a ^ a = 0
        //2. XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.

        /*Here all the numbers except the single number appear twice and      so   will form a pair. Now, if we perform XOR of all elements of the array, the XOR of each pair will result in 0 according to the XOR property 1. The result will be = 0 ^ (single number) = single number (according to property 2).*/

        int xorr = 0;
        int n = nums.length;

        for(int i=0; i<n; i++)
        {
            xorr = xorr ^ nums[i];
        }

        return xorr;
        
    }
}
