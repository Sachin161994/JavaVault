import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        int m = month;
        int d = day;
        int y = year;
        c.set(y, m, d);
        int s = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(s);
        String b = "";
        if(s == 1) {
            b = "MONDAY";
        }
        if(s==2) {
            b = "TUESDAY";
        }
        if(s==3) {
            b = "WEDNESDAY";
        }
        if(s==4) {
            b = "THURSDAY";
        }
        if(s==5) {
            b = "FRIDAY";
        }
        if(s==6) {
            b = "SATURDAY";
        }
        if(s==7) {
            b = "SUNDAY";
        }
        System.out.println(b);
        return b;
                    

}
}

public class Abc {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
