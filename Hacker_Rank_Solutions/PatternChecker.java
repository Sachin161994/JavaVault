import java.util.Scanner;
import java.util.regex.*;

public class PatternChecker
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
            try{testCases-=1;
                Pattern.compile(pattern);
                System.out.println("Valid");
                
            }
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
                
            }
		}
	}
}



