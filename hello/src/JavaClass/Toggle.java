package JavaClass;

public class Toggle {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 30) {
			try {
				Thread.sleep(1000);
				if (i % 6 == 0 || i % 7 == 0) {
					System.out.printf("%2d일 휴식", i);
					System.out.printf("\n");
				} else
					System.out.printf("%2d일 출근", i);
				System.out.printf("\n");
				i += 1;
			} catch (Exception e) {
			}

		}

	}
}

//1초마다 1-5까지는 출근, 6-7번째는 휴식 이라고 번갈아가면서 출력해보기.