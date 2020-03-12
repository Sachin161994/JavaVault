package dsaone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort {
	public static void main(String[] args) {
	List<Integer> values = new ArrayList<Integer>();
	values.add(305);
	values.add(998);
	values.add(774);
	values.add(236);
	values.add(881);
	Comparator<Integer> com = new ComparableCreate();
	Collections.sort(values,com);
	for(int i : values) {
		System.out.println(i);
	} 
	
}
}
