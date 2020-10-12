package JavaClass;

public class ToggleReview {

	public static void main(String[] args) {
		int i = 1;
		while (true) {
			try {
				Thread.sleep(1000);
				if(i % 7 == 5 || i % 7 == 6)
					System.out.println("휴식");
				else
					System.out.println("출근");
				i = i + 1;
			}catch(Exception e) {}
		}
	}
}
