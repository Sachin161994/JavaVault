package dsaone;

import java.util.Scanner;
import java.util.Stack;

public class InfixArithmeticExpression {//Two-Stack-Method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> ops = new Stack<String>();
		Stack<Integer> vals = new Stack<Integer>();
		while(sc.hasNext()) {
			if(sc.equals("("));//Ignore
			else if(sc.equals("+")) ops.push(sc.toString());
			else if(sc.equals("*")) ops.push(sc.toString());
			else if(sc.equals(")")){
				String op = ops.pop();
				if(op.equals("+")) vals.push(vals.pop()+vals.pop());
				else if(op.equals("*")) vals.push(vals.pop()+vals.pop());
				}
			else vals.push(Integer.parseInt(sc.toString()));
		}
		
		System.out.println(vals.pop());
		
		
		
	}
}
