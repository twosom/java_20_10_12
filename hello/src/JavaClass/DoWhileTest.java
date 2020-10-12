package JavaClass;

public class DoWhileTest {
	
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		do {
			if (i % 2 != 0) {
				sum = sum + i;
			}//1부터 100까지 홀수의 합 구할 떄, 조건은 i를 2로 나눴을 때 0이 아니면 홀수,
			 //i가 홀수임이 판단 되면, sum+ i를 sum에 대입.
			i = i + 1;//if문을 빠져나오면 i+1을 다시 i에 대입. 
		} while(i <= 50);
		System.out.println("sum : " + sum);
	}

}
