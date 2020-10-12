package JavaClass;

public class 완전수_과제 {
	
	public static void main(String[] args) {
		int count = 0; // 완전수의 개수를 셀 변수 선언.
		
		for(int n = 2; n <= 1000; n++) {
			int sum = 0; // 합계를 구할 변수 선언
			
			for(int i = 1; i<= n / 2; i++) {//1에서 자신의 절반이 되는 수까지 for문 작성
				
				if(n % i == 0) { //두 수가 나누어 떨어지
					sum += i; //sum변수에 i를 더한다.
				}
			}
			if(sum == n) { //나누어 떨어지는 숫자의 합이 n과 같을 때,
				count += 1;	//count변수에 1씩 더한다.
				System.out.println(sum); //그리고 콘솔창에 완전수의 값을 하나씩 출력.
			}
		}
		System.out.printf("2에서 1000까지의 완전수 : %d개", count);
	}

}
