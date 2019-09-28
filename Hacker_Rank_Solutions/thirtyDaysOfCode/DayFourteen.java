package thirtyDaysOfCode;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    private int[] adifference = new int[100] ;

	// Add your code here
    Difference(int[] a){
        elements = a;
    }

 public int computeDifference(){
     Arrays.sort(elements);
     maximumDifference = java.lang.Math.abs(elements[elements.length-1]-elements[0]);
     return maximumDifference;
 }
} // End of Difference class

public class DayFourteen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}