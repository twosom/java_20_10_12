//for문을 이렇게 써도 괜찮다.
public class Code56_2 {
	
	public static void main(String[] args) {
		int i = 1, sum = 0;
		for(;i<=10;) {
			sum += i;
			i++;
		}
		System.out.printf("sum = %2d", sum);
	}

}
