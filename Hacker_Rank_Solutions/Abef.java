
public class Abef {
	public static void main(String []args) {
		 int likes = 5/2,likes_cum=5/2;
	     int shares= 0;
		for(int i = 1; i<3; i++) {
			shares = likes*3;
            likes = shares/2;
            
            likes_cum = likes_cum + likes;
            
        }
		System.out.println(likes_cum);
	}
}
