package introDuction;

import java.util.*;
import java.io.*;

class LoopsTwo{
    
    public static void main(String []argh){
        double result = 0;
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0; j<n; j++){
                if(j==0){
                    result += a + b*Math.pow(2, j);
                    System.out.printf("%.0f ",result);
                }
                else{
                    result += b*Math.pow(2, j);
                    System.out.printf("%.0f ",result);
                }
                if(j==n-1){
                    System.out.printf("\n");
                    result = 0;
                }
            }
        }
        in.close();
    }
}

