/*
   	하나의 양의 정수를 입력받아서 각 자리수를 떼어서 출력.
 */
public class Code55 {
	
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scan.nextInt();
		
		while (n > 0) {
			int m = n % 10;
			System.out.println(m);
			n = n / 10;
		}
		scan.close();
	}

}
