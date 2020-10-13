package JavaClass;

public class 별모양과제 { 
	public static void main(String[] args) {
	    for(int i = 1; i <= 5; i++ ) {
	        //공백 for문 작성
	        for (int a = 1; a<=5-i; a++){
	          System.out.printf(" ");
	        }
	        //한 줄의 공백 끝난 후에 * 찍기
	        System.out.printf("*");
	        //2번째에서 4번째 줄은 따로 만듦
	        if (i >= 2 && i <= 4) {
	          for(int a = 1; a <= 2*i-3; a++){
	            System.out.printf(" ");
	          }
	          System.out.printf("*");
	        }
	        //마지막 줄도 따로 만듦.
	        //콘솔창에서 폰트 크기 관계로 9개가 아닌 8개로 표기
	        if (i == 5) {
	          for (int a = 1; a <= 8; a++) {
	            System.out.printf("*");
	          }
	        }
	        System.out.println();
	      }
	    }

}
