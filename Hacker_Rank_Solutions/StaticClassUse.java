import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticClassUse{
    static Scanner sc = new Scanner(System.in);
     static int B = sc.nextInt();
     static int H = sc.nextInt();
    
    static{
            
            if(B<=0 || H<=0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
    }

public static void main(String[] args){
		if(B>0 && H>0){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

