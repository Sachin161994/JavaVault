package dsaone;
import java.util.*;

public class QuickUnionUFClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		QuickUnionUF uf = new QuickUnionUF(N);
		for(int i = 0; i < N; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			if(!uf.connected(p, q)) {
				uf.union(p, q);
				System.out.println(p + " " + q);
			}
			
		}
	}
}