package thirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DaySix {

     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int j=0;
        scan.nextLine();
        while(j<n){
        String s = scan.nextLine();
         
        for(int i = 0; i<s.length(); i++){
            if(i%2==0){
                System.out.print(s.charAt(i));
            }
            
        }
        System.out.print(" ");
        for(int i=0;i<s.length(); i++){
             if(i%2==1){
                System.out.print(s.charAt(i));
            }
        }
        System.out.print("\n");
        
        j++;

    }
    }
}



