public class CatnMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        if(java.lang.Math.abs(x-z)<java.lang.Math.abs(y-z)){
            return "Cat A";
        }
        else if(java.lang.Math.abs(x-z)>java.lang.Math.abs(y-z)){
        	 return "Cat B";
        }
        else{
        	 return "Mouse C";
        }

	

    }
    public static void main(String[] args) {
    	CatnMouse m = new CatnMouse();
    	m.catAndMouse(1, 2, 3);
    	
    }
    }