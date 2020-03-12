package stringquestions;

import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.trim();
        String[] arr= str.split("[.,?!' _@]+");
        if(str.length()==0){
            System.out.println("0");
        }
        else{
        System.out.println(arr.length);
        for(int i = 0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }}
        scan.close();
    }
}

