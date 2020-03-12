package stringquestions;

import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String str, int k) {
        String smallest = "";
        String largest = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
    
    for(int i = 0; i<str.length(); i++) {
        for(int j=i+1; j<=str.length();j++) {
            if(str.substring(i, j).length()==k) {
                if(i==0) {
                    smallest = str.substring(i, j);
                    largest = str.substring(i, j);
                }
                else {
                    if(str.substring(i, j).compareTo(smallest)<0) {
                        smallest = str.substring(i, j);
                        
                    }
                    else if(str.substring(i, j).compareTo(largest)>0) {
                        largest = str.substring(i,j);
                        continue;
                    
                    }
                }
            }
        }
    }
     return smallest + "\n" + largest;
    }

}