import java.util.Arrays;
import java.util.Scanner;

class SubstringsOfStringMain
{
 public static void main(String args[])
 {Scanner scan = new Scanner(System.in);
 String s = scan.next();
 int k = scan.nextInt();
  
  System.out.println("All substring of abbc are:");
  String arr[] = new String[100];
  int count=0;
  for(int i = 0; i<s.length(); i++){
      for(int j= i+1; j<=s.length();j++){
          if(s.substring(i,j).length()==k){
          arr[i]=s.substring(i,j);
          System.out.println(arr[i]);
          count++;}
      }
  }
  System.out.println(count);
  Arrays.sort(arr);
  for(int i = 0; i<s.length(); i++){
     
  }
  String smallest = "";
  String largest = "";
  //System.out.println(arr[0].compareTo(arr[1]));
  /*if(arr[0].compareTo(arr[1])<0) {
    //smallest*/
  
 for(int i = 0;i<count;i++){
	  for(int j= i+1; j<count;j++){
		  if(arr[i].compareTo(arr[j])<0) {
			  smallest=arr[i];
		  }
		  else {
			  smallest = arr[j];
	  }
	 }
  }
 for(int i = 0;i<count;i++){
	  for(int j= i+1; j<count;j++){
		  if(arr[i].compareTo(arr[j])>1) {
			  largest=arr[i];
		  }
		  else {
			  largest = arr[j];
	  }
	 }
 }
/*	  smallest= arr[1];}
  else {
	  smallest = arr[0];
  }
*/
  System.out.println(smallest);
  System.out.println(largest);
  scan.close();
  }
   
  }
 


 

 