package JavaClass;

public class 반복문Review {
	
	public static void main(String[] args) {
		for (int i = 1; i<= 5; i ++) {
			for (int j = 1; j <= 6 - i; j ++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}
}


// i * (늘어나는 양) =첫번쨰