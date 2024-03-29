public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) 
    {
        int[] result = new int[2];
        int secondSmallest = getSecondSmallest(a,n);
        int secondLargest = getSecondLargest(a,n);
        result[0] = secondLargest;
        result[1] = secondSmallest;
        return result;
    }

    private static int getSecondSmallest(int[] arr, int n)
    {
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for(int i=0 ; i<n ; i++)
        {
            if(arr[i] < small)
            {
                secondSmall = small;
                small = arr[i];
            }
            else if(arr[i] < secondSmall && arr[i] != small)
            {
                secondSmall = arr[i];
            }
        }

        return secondSmall;

    }



     private static int getSecondLargest(int[] arr, int n)
     {
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++)
        {
            if(arr[i] > large)
            {
                secondLarge = large;
                large = arr[i];
            }
            else if(arr[i] > secondLarge && arr[i] != large)
            {
                secondLarge = arr[i];
            }
        }

        return secondLarge;

     }



}
