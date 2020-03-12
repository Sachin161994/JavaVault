
public class Tokens {
public static void main(String[] args) {
	String as = "  ab.cd ef";
	System.out.println(as.trim());
	String[] a = as.split(",. ");
	for(int i = 0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
}
}
