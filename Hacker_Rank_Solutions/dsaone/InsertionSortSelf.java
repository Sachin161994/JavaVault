package dsaone;

import java.util.Collection;

public class InsertionSortSelf {
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
			for(int j = i; j>0;j--) {
				if(less(a[j], a[j-1]))
					exch(a,j,j-1);
				else break;
			}
			
		}
	}
	public static void main(String[] args) {
		Comparable[] arravg = {3,1,2,5,4,7,6};
		Comparable[] arrbest = {1,2,3,4,5,6,7};
		Comparable[] arrworse = {7,6,5,4,3,2,1};
		
		long startTime = System.nanoTime();
		InsertionSortSelf.sort(arravg);
		long endTime = System.nanoTime();
		long durationInNano = (endTime - startTime);
		System.out.println(durationInNano);
		
		long startTime1 = System.nanoTime();
		InsertionSortSelf.sort(arrbest);
		long endTime1 = System.nanoTime();
		long durationInNano1 = (endTime1 - startTime1);
		System.out.println(durationInNano1);
		
		long startTime2 = System.nanoTime();
		InsertionSortSelf.sort(arrworse);
		long endTime2 = System.nanoTime();
		long durationInNano2 = (endTime2 - startTime2);
		System.out.println(durationInNano2);
		
		Comparable[] a = {7,6,5,4,3,2,1};
		long startTime3 = System.nanoTime();
		InsertionSortSelf.sort(a);
		long endTime3 = System.nanoTime();
		long durationInNano3 = (endTime3 - startTime3);
		System.out.println(durationInNano3);
		
		
	}
}
