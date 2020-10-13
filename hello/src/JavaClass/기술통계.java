package JavaClass;

public class 기술통계 {
	
	public static void main(String[] args) {
		//이름배열
		String [] devices;
		devices = new String[5];
		devices[0] = "iPhone";
		devices[1] = "iPad";
		devices[2] = "MacBook";
		devices[3] = "Watch";
		devices[4] = "iMac";
		
		//정수배열
		int [] Prices = {699, 499, 1099, 399, 1799};
		
		//500달러가 넘는 제품의 개수 그리고 평균 구하기
		//평균은 소수 첫째짜리까지 구하기 - 소수 둘째자리에서 반올림.
		
		//합계를 저장할 변수와 개수를 구할 변수를 생성
		int sum = 0;
		int count = 0;
		
		//배열 순회
		for(int Price : Prices) {
			//500달러가 넘는 가격을 만나면 Price는 sum에 추
			if (Price > 500) {
				sum = sum + Price;
				count = count + 1;
			}
		}
		
		//합계와 개수 출력
		System.out.printf("500달러가 넘는 합계 : %d\n", sum);
		System.out.printf("500달러가 넘는 개수 : %d\n", count);
		
		//평균
		if(count == 0) {
			System.out.println("조건에 맞는 데이터가 없습니다.");
		}
		else {
			double avg = (double)sum /count;
			System.out.printf("500달러가 넘는 가격들의 평균치 : %.1f\n", avg);
			//소수 부분을 구하기 위해서 sum을 double로 형변환해서 수행
			//소수 둘째 자리에서 반올림해서 출력하기 위해서 실수 출력형식을 .1f로 설정
		}
		//최대값과 최소값 구하기
		//최대값을 저장할 변수를 생성 - 아주 작은 값이나 배열의 첫번째 값으로 초기화
		int max = 0;
		//최소값을 저장할 변수를 생성 - 아주 큰 값이나 배열의 첫번째 값으로 초기화
		int min = 1000;
		//배열을 순회하면서 max나 min보다 큰 값이나 작은 값을 만나면 그 값으로 교체
		for(int Price : Prices) {
			//최대값
			if(max < Price) {
				max = Price;
			}
			//최소값
			if(min > Price) {
				min = Price;
			}
		}
		System.out.printf("최대값 : %d\n",max);
		System.out.printf("최소값 : %d\n", min);
	}

}
