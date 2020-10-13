package JavaClass;

public class perfectNumber {

	public static void main(String[] args) {
		//2부터 10000까지 완전수 개수 구하기
		//완전수 : 자기 자신을 제외한 약수의 합이 자기 자신과 동일한 
		int count = 0;//완전수의 갯수를 셀 변수 선언
		System.out.print("완전수 : ");
		
		for (int n = 2; n <= 80000; n++) {	//2부터 10000까지
			int sum = 0;
			for(int i = 1; i <= n / 2; i++) {
				//완전수를 구하려면 1부터 자신의 절반이 되는 숫자까지 나누어서 떨어지는 숫자의 합을 계산해서 자기 자신과 비교.
				if(n % i == 0) {
					sum += i;
				}
			}
			if (sum == n) {
				count += 1;
				System.out.printf(sum + " ");
			}
			
		}
		System.out.println();
		System.out.println("1부터 80000까지의 완전수 갯수 : " + count);
	}
}
