package JavaClass;

public class 반복문ReviewReview {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i +=1) {
			if(i<=3) {
				//늘어나는부분
				for (int j = 1; j <= i; j += 1) {
					System.out.printf("*");
				}
				System.out.println("");
			}else {
				//줄어드는부분
				for (int j = 1; j <= 6-i; j += 1) {
					System.out.printf("*");
				}
				System.out.println("");
			}
		}
	}
}
