public class Solution {
    public static int countDigits(int n)
    {
        int temp = n;
        int count = 0;
        while(temp != 0)
        {
            int div = temp%10;
            if(div>0 && n%div == 0)
            {
                count++;
            }
            temp = temp/10;
        }
        return count;
    }
}
