public class Solution {
        public static int[] moveZeros(int n, int []a) 
        {
            int currIdx = 0;

            for(int i =0 ; i<n; i++)
            {
                if(a[i] == 0)
                {
                    continue;
                }
                else
                {
                    swap(a,currIdx,i);
                    currIdx++;
                }
            }

            for(int i=currIdx; i<n; i++)
            {
                a[i] = 0;
            }

            return a;
        
        }


        private static void swap(int[] arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
}
