package JavaClass;

public class PrimeCount {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i <= 1000; i += 1) {
			int count = 0;
			for (int j = 1; j <= i; j += 1) {
				if (i % j == 0) {
					count += 1;
				}
			}
			if (count == 2) {
				result += 1;
			}
		}

		System.out.println(result);
	}

}
