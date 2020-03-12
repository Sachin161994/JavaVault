import java.util.Arrays;

class TestingBS {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
       int[] nums1 = new int[nums.length];
       for(int i = 0; i < nums.length; i++){
           for(int j = 0; j<nums.length; j++){
               System.out.println(nums[i]);
               if(nums[i]>nums[j]){
                   nums1[i] +=1;
               }
           }
       }
    return nums1;
    }

	public static void main(String[] args) {
		
		int arr[] = {8,1,2,2,3};
		int[] y = new int[arr.length];
		y = smallerNumbersThanCurrent(arr);		
		for(int i = 0; i<y.length;i++) {
			System.out.print(" "+y[i]);
		}
	}
}
