package exercise;

public class Exercise04 {

	public static void main(String[] args) {
		int x=0, y=0;
		
		while ((x+y) != 5) {
//			System.out.printf("(%d, %d)\n", x, y);		//Math.random() : p.113			
			x = (int)(Math.random()*6) + 1;
			y = (int)(Math.random()*6) + 1;
			System.out.printf("(%d, %d)\n", x, y);
		}
	}
}
