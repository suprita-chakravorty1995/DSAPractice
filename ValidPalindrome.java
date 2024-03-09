class Solution {
    public static boolean isPalindrome(String s) {
        String str = s.trim();
		int len = str.length();
		return checkPalindrome(str,0,len-1);
	}

	private static boolean checkPalindrome(String str, int start, int end)
	{
        while(start < end && !Character.isLetterOrDigit(str.charAt(start)))
		{
			start ++;
		}

		while(end > start && !Character.isLetterOrDigit(str.charAt(end)))
		{
			end --;
		}

        if(start >= end)
		{
			return true;
		}

		if(!isEquals(str.charAt(start),str.charAt(end)))
		{
			return false;
		}

		return checkPalindrome(str,start+1, end -1);
	}

	private static boolean isEquals(char a, char b)
	{
		if( Character.isDigit(a) && Character.isDigit(b))
		{
			return Integer.parseInt(String.valueOf(a)) == Integer.parseInt(String.valueOf(b));
		}
		else if(Character.isAlphabetic(a) && Character.isAlphabetic(b))
		{
			return Character.toLowerCase(a) == Character.toLowerCase(b);
		}
		else
		{
			return false;
		}
	}
}
