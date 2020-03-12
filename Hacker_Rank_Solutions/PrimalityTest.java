import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PrimalityTest {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger b = new BigInteger(String.valueOf(n));
        boolean prime = b.isProbablePrime(1);
        if(prime == true){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        scanner.close();
    }
}
