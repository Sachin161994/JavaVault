/*"In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source." — (Wikipedia: End-of-file)

The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//import java.io.*;

public class EndOfFile {
    
	public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
         do
            {   
                String t = sc.nextLine();
                System.out.printf("%d %s\n",i,t);
                i++;
            }
        while(sc.hasNext());
        }

    }