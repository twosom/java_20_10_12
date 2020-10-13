/*
  하나의 양의 정수 n을 입력 받아서 while 반복문을 이용해 약수를 모두 출력.
 */


public class Code54 {

	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scan.nextInt();
		int a = 1;
		while(a <= n) {
			if (n % a == 0) {
				System.out.print(a +" ");
			}
			a += 1;
		}
		scan.close();
	}
}
