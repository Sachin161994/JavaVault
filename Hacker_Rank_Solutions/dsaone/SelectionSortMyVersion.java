package dsaone;

import java.util.Scanner;

public class SelectionSortMyVersion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		int temp,min = 0,count = 0;
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n-1 ; i++) { //Selection of element from start
				min = arr[i];
			for(int j = i+1 ; j<n ; j++) {//Checking for the next smallest element	
				if(arr[j]<min) {
					min = arr[j];
					count = j;
				}
			}
			temp = arr[i];
			arr[i] = min;
			arr[count] = temp;
		}
	
	for(int k = 0; k<n; k++) {
		System.out.println(arr[k]);
	}
	}
}
