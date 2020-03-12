

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class TwoDArray {


	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int[][] arr = new int[6][6];

	        for (int i = 0; i < 6; i++) {
	            String[] arrRowItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < 6; j++) {
	                int arrItem = Integer.parseInt(arrRowItems[j]);
	                arr[i][j] = arrItem;
	            }
	        }
	        int sum[] = new int[100];
	        int k = 0;
	        int count = 0;
	        for(int i = 0; i< 6; i++){
	            for (int j = 0; j<6; j++){
	                if(arr[i][j]!=0&&arr[i][j+1]!=0&&arr[i][j+2]!=0&&arr[i+1][j+1]!=0&&arr[i+2][j]!=0&&arr[i+2][j+1]!=0&&arr[i+2][j+2]!=0){
	                    sum[k] = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
	                    k++;
	                    count++;
	                }
	            }
	        }
	        int max = sum[0]; 
	        
	         // Traverse array elements from second and 
	         // compare every element with current max   
	         for (int i = 1; i < count; i++) {
	             if (sum[i] > max) { 
	                 max = sum[i]; }
	         }
	        
	         
	      
	        System.out.println(max);

	        scanner.close();
	    }
	}


