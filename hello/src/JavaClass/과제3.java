package JavaClass;

public class 과제3 {
	/*
	 	***	1 - 3
	 	 **	2 - 2
	 	  *	3 - 1
	 	 **	4 - 2
	 	***	5 - 3
	 	
	 */

	public static void main(String[] args) {
		char star = '*';
		for(int i = 1; i <= 5; i += 1) {
			for(int j = 1; j <= 4 -i; j+=1) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}
}
