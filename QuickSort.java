
public class Solution {
	
	public static void quickSort(int[] input,int startIndex, int endIndex) 
	{
		if(startIndex < endIndex)
		{
			int pi = partition(input,startIndex,endIndex);
			quickSort(input, startIndex, pi-1);
			quickSort(input, pi+1, endIndex);

		}
	}

	private static int partition(int[] arr, int low, int high)
	{
		int pivot = arr[high];
		int i = low-1;

		for(int j= low; j < high; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr,i+1,high);
		return i+1;
	}

	private static void swap(int[] arr, int low, int high)
	{
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}


	
}
