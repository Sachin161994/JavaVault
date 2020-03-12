import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
				arr[i] = sc.nextInt();		
		}
		Arrays.sort(arr);
		int sum = 0;
		int count = 0;
		for(int i = 0; i<n ; i++) {
			for(int j = i+1 ; j<=n ; j++) {
				sum = -(arr[i]+arr[j]);
				if(dsaone.BinarySearch.binarySearch(arr, sum)!=-1) {
					count++;
				
				}
			}
		}
		System.out.println(count);
	}
}
