import java.util.Scanner;


public class Code47 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int x = scan.nextInt();
		System.out.print("실수를 입력하시오 : ");
		Double y = scan.nextDouble();
		System.out.print("이름을 입력하시오 : ");
		String name = scan.next();
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("name : " + name);
		
		scan.close();
	}

}
