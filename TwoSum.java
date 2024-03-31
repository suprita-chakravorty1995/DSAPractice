class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int[] result = new int[2];
        Map<Integer,Integer> idxMap = new HashMap<Integer,Integer>();
        int n = nums.length;

        for(int i=0; i<n; i++)
        {
            int rem = target - nums[i];
            if(idxMap.containsKey(rem))
            {
                result[0] = idxMap.get(rem);
                result[1] = i;
                return result;
            }
            else
            {
                idxMap.put(nums[i], i);
            }
        }

        return result;
        
    }
}
