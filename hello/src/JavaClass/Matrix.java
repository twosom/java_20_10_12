package JavaClass;

public class Matrix {

	public static void main(String[] args) {
		//문자열 2차원 배열을 생성
		String [][] names = {{"태연", "유리", "윤아"}, {"지수", "제니", "로사"}};
		
//		//행의 순회
//		for(int i = 0; i < names.length; i += 1) {
//			//열의 순회
//			for(int j = 0; j < names[i].length; j += 1) {
//				System.out.printf("%10s", names[i][j]);
//			}
//			System.out.println();
//		}
		
		//빠른 열거 이용
		//배열의 배열이므로 처음에는 배열에 저장하고
//		for(String [] temp1 : names) {
//			//그 배열을 다시 순서대로 순회
//			for(String temp2 : temp1) {
//				System.out.printf("%15s",  temp2);
//			}
//			System.out.println();
//		}
		
		//일차원 배열을 이차원 배열 처럼 이용
		//이 구조는 실무에서도 많이 이용
		String [] zip_names = {
				"이소망", "이예송", "이찬송", 
				"김시원", "김지혜", "최종훈"};
		
		for(int i = 0; i < zip_names.length; i += 1) {
			System.out.printf("%15s", zip_names[i]);
			if (i % 3 == 2) {
				System.out.println();
			}
		}
	}
}
