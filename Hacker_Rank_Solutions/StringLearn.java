/*Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.:does A come before B in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space. */
import java.io.*;
import java.util.*;

public class StringLearn {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        System.out.println(sum);
        int z = A.compareTo(B);
        if(z <= 0){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
        A = A.substring(0,1).toUpperCase() + A.substring(1,A.length()).toLowerCase();
        B = B.substring(0,1).toUpperCase() + B.substring(1,B.length()).toLowerCase();
        System.out.printf("%s %s",A,B);
    }
}



