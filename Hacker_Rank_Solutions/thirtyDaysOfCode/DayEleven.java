package thirtyDaysOfCode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays; 
  

public class DayEleven {



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
        int max_sum = 0;
    int temp_sum;
    for(int i = 0; i < 4; i++) {
        for(int j = 0; j < 4; j++) {
            temp_sum = 0;

            temp_sum += arr[i][j];
            temp_sum += arr[i][j+1];
            temp_sum += arr[i][j+2];
            temp_sum += arr[i+1][j+1];
            temp_sum += arr[i+2][j];
            temp_sum += arr[i+2][j+1];
            temp_sum += arr[i+2][j+2];                                                          
            if(temp_sum > max_sum || i == 0 && j == 0)
                max_sum = temp_sum;
        }
    }
    System.out.println(max_sum);

        scanner.close();
    }
}

