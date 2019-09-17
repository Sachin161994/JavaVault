package biginteger;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigIntegerH {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        BigInteger b1 = new BigInteger(String.valueOf(s1));
        BigInteger b2 = new BigInteger(String.valueOf(s2));
        BigInteger b3 = b1.add(b2);
        BigInteger b4 = b1.multiply(b2);
        System.out.println(b3);
        System.out.println(b4);
         
    }
}

