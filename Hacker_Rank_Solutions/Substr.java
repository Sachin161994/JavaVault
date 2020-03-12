import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class Substr {
static String x = "07:00:00PM";
static char a= x.substring(1,2);
static int u=a.repeat(7);
static String b=x.substring(2,8);
static String c=x.substring(8,10);
static int conv = Integer.valueOf(a);
static int conv2=conv+12;
static String conv1=String.valueOf(conv2);
public static void main(String[] args) {
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(conv+12);
System.out.println(conv1);

System.out.println(conv1+b);


}}
