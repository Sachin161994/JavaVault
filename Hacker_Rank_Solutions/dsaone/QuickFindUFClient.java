package dsaone;
import java.util.*;

public class QuickFindUFClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		QuickFindUF uf = new QuickFindUF(N);
		for(int i = 0; i < N; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			if(!uf.find(p, q)) {
				uf.connect(p, q);
				System.out.println(p + " " + q);
			}
			
		}
	}
}
