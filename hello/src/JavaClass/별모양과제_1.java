package JavaClass;

public class 별모양과제_1 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			if(i <= 3) {
				//공백입력 for문
				for(int a = 1; a <= i - 1; a++) {
					System.out.print(" ");
				}
				//*입력 for문
				for(int b = 1; b <= 4 - i; b ++) {
					System.out.print("*");
				}
			}
			
			if(i >= 4) {
				//줄어드는 공백 for문
				for(int a = 1; a <= 5-i; a ++) {
					System.out.print(" ");
				}
				//늘어나는 * for문
				for(int b = 1; b <= i - 2; b ++) {
					System.out.print("*");
				}
			}
			System.out.println();	//다음줄로 개행
			
			
		}
	}

}
