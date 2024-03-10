public class Solution {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<arr.length-1; i++)
        {
            int mini = i;
            for(int j = i+1; j<n; j++)
            {
                if(arr[j] < arr[mini])
                {
                    mini = j;
                }
            }

            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
}
