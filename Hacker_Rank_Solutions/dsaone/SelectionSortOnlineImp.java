package dsaone;

public class SelectionSortOnlineImp {
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w)<0;
	}
	private static void exch(Comparable[] a, int i, int j) {
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	public static void sort(Comparable[] a) {
		int N = a.length;
		for(int i = 0; i<N; i++) {
			int min = i;
			for(int j = i+1; j<N; j++) {
				if(less(a[j],a[min])) min = j;
			}
			exch(a,i,min);
		}
	}
	public static void main(String[] args) {
		Comparable[] a = {7,6,5,4,3,2,1};
		long startTime2 = System.nanoTime();
		SelectionSortOnlineImp.sort(a);
		long endTime2 = System.nanoTime();
		long durationInNano2 = (endTime2 - startTime2);
		System.out.println(durationInNano2);
		
		for(Comparable i : a) {
			System.out.println(i);
		}
	}

}

