
public class Valleys {
public static void main(String []args) {
	int lvl=0,valley=0;
	String s = "UDDDUDUU";
	for(int i = 0; i<8;i++) {
		if(s.charAt(i)=='U') {
			++lvl;
		}
		else if(s.charAt(i)=='D') {
			--lvl;
		}
		
		if(s.charAt(i)=='U'&&lvl==0) {
			//System.out.println("hello");
			++valley;
		}
		System.out.println(lvl);
	}
	System.out.println(valley);
}
}
