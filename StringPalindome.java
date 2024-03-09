public class Solution {
    public static boolean isPalindrome(String str) 
    {
        int len = str.length();
        return checkPalindrome(str,0,len-1);
    }

    private static boolean checkPalindrome(String str, int start, int end)
    {
        if(start > end)
        {
            return true;
        }

        if(str.charAt(start) != str.charAt(end))
        {
            return false;
        }

        return checkPalindrome(str,start+1, end -1);
    }
}
