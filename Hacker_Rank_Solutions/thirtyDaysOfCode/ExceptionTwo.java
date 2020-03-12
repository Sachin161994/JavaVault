package thirtyDaysOfCode;

import java.util.*;
import java.io.*;

//Write your code here
class Calculator{
    int n = 0;
    int p = 0;
    int pow = 1;
    int power(int x, int y){
        n = x;
        p = y;
        
            try{
                if(n<0 || p<0){
                    throw new Exception("demo");
                    }
                
            }
            catch(Exception e){
                System.out.println("n and p should be non-negative");

            }
              for(int i = 0; i<p; i++){
                      pow*=n;
                    }
        return pow;
        
    }
}
class ExceptionTwo{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
