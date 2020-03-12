import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String a1= a.toLowerCase();
        String b1= b.toLowerCase();
        char[] gfg = a1.toCharArray();
        char[] gfg2 = b1.toCharArray();
        java.util.Arrays.sort(gfg);
        /*for(int i = 0; i<a.length();i++) {
            System.out.print(gfg[i]);
            System.out.println("");
        }*/
        java.util.Arrays.sort(gfg2);
        /*for(int i = 0; i<a.length();i++) {
            System.out.print(gfg2[i]);
        }*/
        int count=0;
        int hash= a.length();
        int bash= b.length();
        int lmin= Math.min(hash,bash);
        if(a.length()!=b.length()){
            return false;
        }
        else{
           for(int i = 0; i<lmin; i++) {
             if(gfg[i]==gfg2[i]) {
                count++;
            }
        }
        if(count==a.length()) {
            return true;
        }
        else {
            return false;
        }
        
        }  
        }
       
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}