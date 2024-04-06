class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int curr = m + n -1;
        m--;
        n--;
        while(m >= 0 && n >= 0)
        {
            if(nums1[m] >= nums2[n])
            {
                nums1[curr] = nums1[m];
                m--;
            }
            else
            {
                nums1[curr] = nums2[n];
                n--;
            }
            curr--;
        }

        while(n >= 0)
        {
            nums1[curr] = nums2[n];
            n--;
            curr--;
        }
        
    }
}
