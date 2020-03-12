import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass {



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
        int[] sum = new int[100];
        for(int i = 0; i<6;i++) {
        	for(int j = 0; j<6;j++) {
        		if(arr[i][j]!=0 && arr[i][j-1]!=0 && arr[i][j+1]!=0 && arr[i+1][j]!=0 && arr[i+2][j-1]!=0 && arr[i+2][j+1]!=0 && arr[i+2][j]!=0) {
        				sum[i]=arr[i][j] + arr[i][j-1] + arr[i][j+1] + arr[i+1][j] + arr[i+2][j-1] + arr[i+2][j+1] + arr[i+2][j];
        		}
        	}
        }
        int max = Arrays.stream(sum).max().getAsInt();
        System.out.println(max);

        scanner.close();
    }
}
