import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryConv {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String count ="";
        do {
        	if(n%2==1) {
        		n = (n-1)/2;
        		count += "1";
        		}
        	
        	else {
        		n= n/2;
        		count+="0";
        		
        	}
        	
        }
        while(n>0);
        int repeat = 0;
        //System.out.println("\n");
        for(int i =0; i<count.length()-1;i++) {
        	for(int j =1; j<count.length();j++) {
    		if(count.charAt(i)=='1' && count.charAt(j)=='1') {
    			repeat++;
    		}
    	}
        }
       
        
        System.out.println(repeat);
        scanner.close();
    }
}
