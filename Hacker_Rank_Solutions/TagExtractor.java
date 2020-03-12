
public class TagExtractor {
static String x = "<header> Hello World</header>";
public static void main(String[] args) {
	for(int i = 0;i<x.length(); i++) {
	if(x.charAt(i)=='>') {
		System.out.print(x.charAt(i+1));
		
	}
	
	}
}
}
