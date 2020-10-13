
public class Code57 {
	
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.print("Enter n :  ");
		int n = scan.nextInt();
		int count = 0;
		for(int i = 1; i <= n; i ++) {
			if (n % i == 0)
				count += 1;
		}
		if (count == 2)
			System.out.println(n + "은 소수입니다.");
		else
			System.out.println(n + "은 소수가 아닙니다.");
		scan.close();
	}
}
