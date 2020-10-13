package JavaClass;

public class Fibonacci {

	public static void main(String[] args) {
		//정수를 입력받아서 정수 번째 피보나치 수열의 값 구하기
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.printf("구하고자 하는 수열의 위치는? : ");
		int n = scan.nextInt();
		
		//필요한 변수를 생성
		int n1 = 1;	//이전 첫번째 항의 값
		int n2 = 1;	//이전 두번째 항의 값
		int result = 0;	//피보나치 수열의 값 저장
		
		for(int i = 3; i <= n; i++) {
			//이전 2개 항의 값을 더해서 result를 구함
			result = n1 + n2;
			//이전 2개 항의 값을 변경
			//이전 2개 항의 값을 자기 뒤의 값으로 변경;
			n1 = n2;
			n2 = result;
			
		}
		System.out.println(result);
		scan.close();
	}
}
