package introDuction;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializer {
static Scanner input = new Scanner(System.in);
static int H = input.nextInt();
static int B = input.nextInt();
static boolean flag;

static{
    try{
        if(B<=0 || H<=0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else{
            flag = true;
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
    

}


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

