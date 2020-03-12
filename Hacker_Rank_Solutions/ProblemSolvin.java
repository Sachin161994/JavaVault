import java.util.*;
public class ProblemSolvin {
	public void sum1(int arr1[],int arr2[],int tar) {
		int a1len = arr1.length;
		int a2len = arr2.length;
		int diff = 0;
		int[] arr3 = new int[a1len*a2len];
		List<Integer> arrlist 
        = new ArrayList<Integer>(); 
		int k =0;
    // Add the new element 
		for(int i = 0; i<arr1.length;i++) {
			for(int j = 0; j<arr2.length; j++) {
				arr3[k] = arr1[i]+arr2[j];
			    if(arr3[k] == tar) {
			    	System.out.println("1st pair " + arr1[i] + " " + arr2[j]);
			    }
			    else {
			    	if(arr3[k] <= tar+3 && arr3[k] >= tar - 3) {
			    		System.out.println(arr1[i] + " " + arr2[j]);}
			    }
			    k++;
			}
		}
	}
}
