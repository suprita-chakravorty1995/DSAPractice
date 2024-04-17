class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int maxLen = 0, l=0, r=0;
        int n = s.length();
        int[] chars = new int[256];
        Arrays.fill(chars,-1);
        while(r < n)
        {
            char c = s.charAt(r);
            if(chars[c] >= l)
            {
                l = chars[c] + 1;
            }
            chars[c] = r;
            int len = r - l + 1;
            maxLen = Math.max(len,maxLen);
            r++;
        }
        return maxLen;
    }
}
