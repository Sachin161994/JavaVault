package poblemSolving;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String a = s.substring(8,10);
        String b = s.substring(0,2);
        String c = s.substring(2,8);
        int bi=0;
        String bs="00";
        String time = "";
        if(a.equals("PM")&&b.equals("12")) {
            time = b.concat(c);
        }
        
        else if(a.equals("PM")){
            bi = Integer.valueOf(b);
            bi+=12;
            b = String.valueOf(bi);
            time = b.concat(c);
        }
        else {
        if(a.equals("AM")&&b.equals("12")) {
            time = bs.concat(c);
        }
        
        else{
            
            time = b.concat(c);
            
        }}
        return time;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
