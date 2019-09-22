package thirtyDaysOfCode;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class DayEight{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Dictionary hr = new Hashtable();
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          hr.put(name,phone);
          // Write code here
      }
      while(in.hasNext()){
          String s = in.next();
          if(hr.get(s)==null){
              System.out.println("Not found");

          }
          else{
              System.out.println(s+"="+hr.get(s));
          }
      }
      in.close();
  }
}

