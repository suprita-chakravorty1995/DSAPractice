import java.util.*;
public class Solution {

    public static void mergeSort(int[] arr, int l, int r){
        if(l >= r)
        {
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }

    private static void merge(int[] arr, int l, int m, int r)
    {
        List<Integer> list = new ArrayList<Integer>();
        int left = l;
        int right = m+1;

        while(left <= m && right <= r)
        {
            if(arr[left] <= arr[right])
            {
                list.add(arr[left]);
                left++;
            }
            else
            {
                list.add(arr[right]);
                right++;
            }

        }

        while(left <= m)
        {
            list.add(arr[left]);
            left++;
        }

        while(right <= r)
        {
            list.add(arr[right]);
            right++;
        }

        for(int i=l; i<=r; i++)
        {
            arr[i] = list.get(i-l);
        }
    }
}
