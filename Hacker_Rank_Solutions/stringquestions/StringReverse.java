package stringquestions;

import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse = "";
        /* Enter your code here. Print output to STDOUT. */
        for(int i = A.length() - 1;i>=0; i--){
             reverse = reverse + A.charAt(i);
            }
        if(A.compareTo(reverse)==0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}



