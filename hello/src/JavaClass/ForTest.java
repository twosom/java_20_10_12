package JavaClass;

public class ForTest {

	public static void main(String[] args) {
	//1부터 100까지 더한 합을 for를 이용해서 작성
		int sum = 0; //합계를 저장할 변수는 밖에 생성.
		for(int i = 1; i <= 100; i = i + 1)
			sum = sum + i;
		System.out.println(sum);
		
		
	}
}
