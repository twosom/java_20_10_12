package JavaClass;

public class 과제 {
	public static void main(String[] args) {
		/*
		 	1*****	1 - 5
		 	2*****	2 - 5
		 	3*****	3 - 5
		 	4*****	4 - 5
		 	5*****	5 - 5
		 	별 5개를 출력하고 줄 바꿈 하는 것을 5번 수행
		 	가로 방향이 안쪽 반복문이 되고
		 	세로 방향이 바깥쪽 반복문이 됨.
		 	
		 */
		
//		for (int i = 1; i <= 5; i += 1) {
//			for (int j = 1; j <= 5; j += 1) {
//				System.out.printf("*");
//			}
//			System.out.printf("\n");
//		}
		
		/* 
		 	1*		1-1
		 	2**		2-2
		 	3***	3-3
		 	4****	4-4
		 	5*****	5-5
		 	*이 하나씩 증가하는 구
		 변하는 숫자의 증감치를 구해서 바깥쪽 반복문의 변수에 곱한 후
		 더하기 빼기를 이용해서 결과를 맞추는 작업 수행
		 1씩 증가하므로 1 *i
		 */
//		for (int i = 1; i <= 5; i += 1) {
//			for (int j = 1; j <= i; j += 1) {
//				System.out.printf("*");
//			}
//			System.out.println("");
//		}
		
		/*
		 	1*****	1-5
		 	2****	2-4
		 	3***	3-3
		 	4**		4-2
		 	5*		5-1
		 	
		 	*이 점점 감소하는 형태. i가 1일때  i * 증가하는 양(-1)을 할때 5가 나오려면
		 	-1(i) + 6 = 5
		 	-i + 6 = 5
		 	6-i가 범위가 
		 */
//		for (int i = 1; i <= 5; i += 1) {
//			for (int j = 1; j <= 6-i; j += 1) {
//				System.out.printf("*");
//			}
//			System.out.println("");
//		}
		
		/*
		 	1*		1 - 1
		 	2**		2 - 2
		 	3***	3 - 3
		 	4** 	4 - 2
		 	5*		5 - 1
		 	
		 	3번째 줄 까지는 1개씩 늘어나고
		 	4번째 줄 부터는 1개씩 줄어드는 구조
		 	하나의 패턴이 아닌 경우에는 동일한 패턴이 적용되는
		 	지점까지 분할을 해서 해결
		 	
		 */
		 for (int i = 1; i <= 5 ; i += 1) {
			if (i <= 3) {
				//증가하는 부분
				for (int j = 1; j <= i; j += 1) {
					System.out.printf("*");
				}System.out.println("");
				
			}
			else {
				//감소하는 부분
				for (int j = 1; j <= 6-i ; j += 1) {
					System.out.printf("*");
				}System.out.println("");
			}
		 }
	}
}
