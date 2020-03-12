import java.util.Scanner;

public class SubstringComp {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int count= 0;
        String arr[]= new String[100];
        for(int i = 0; i<s.length(); i++){
            for(int j= i+1; j<s.length();j++){
                if(s.substring(i,j).length()==k){   
                    arr[i]=s.substring(i,j);
                    count++;
          }
      }
   }
      for(int i = 0;i<count;i++){
          for(int j = i+1;j<s.length();j++){
              if(arr[i].compareTo(arr[j])<0){
                  smallest = arr[j];
              }
              else{
                  smallest = arr[i];
              }

          }
      }
                
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}