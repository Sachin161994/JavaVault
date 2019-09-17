package stringquestions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        if(S==""){
            System.out.println("Enter a valid string");
        }
        int start = in.nextInt();
        int end = in.nextInt();
        S = S.substring(start, end);
        System.out.println(S);
    }
}

