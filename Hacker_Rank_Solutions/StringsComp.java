
public class StringsComp {
static String str = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
static String str1 = "Ababcd";
static int i = str.compareTo(str1);
public static void main(String[] args) {
	System.out.println(i);
	String smallest="";
	String largest="";
	
	for(int i = 0; i<str.length(); i++) {
		for(int j=i+1; j<=str.length();j++) {
			if(str.substring(i, j).length()==3) {
				System.out.println(str.substring(i, j));
				if(i==0) {
					smallest = str.substring(i, j);
					largest = str.substring(i, j);
				}
				else {
					if(str.substring(i, j).compareTo(smallest)<0) {
						smallest = str.substring(i, j);
						
					}
					else if(str.substring(i, j).compareTo(largest)>0) {
						largest = str.substring(i,j);
						continue;
					
					}
				}
			}
		}
	}
	System.out.println("\n"+smallest);
	System.out.println("\n"+largest);
}
}
