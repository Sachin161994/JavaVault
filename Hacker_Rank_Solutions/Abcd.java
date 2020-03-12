import java.io.*;
import java.util.*;
class Abcd{
	public static void main(String[] args) {
	
	int[] arr= {1,4,5,4,5};
	int sum = 0;
	int max = Arrays.stream(arr).max().getAsInt(); 	
	Arrays.sort(arr);
	int k =1;
	for(int i = 0; i<4;i++) {
		for(int j = i+1; j<4;j++) {
			if(arr[i]!=arr[j]) {
				sum+=arr[i];
			}
			else{
				sum+=max+k;
				k+=1;
			}
		}
	}
	System.out.print(sum+arr[4]+1);
}}