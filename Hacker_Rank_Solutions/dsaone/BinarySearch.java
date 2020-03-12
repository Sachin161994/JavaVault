package dsaone;

public class BinarySearch {
	static int index = 0;
	
	public static int binarySearch(int arr[], int n) {
		int low = 0;
		int high = arr.length-1;
		while(low<high) {
		int mid = low + (low+high)/2;
		if(n < arr[mid]) high = mid - 1;
		else if(n > arr[mid]) low = mid + 1;
		else return mid;
		
		}
		return -1;
	}
}
