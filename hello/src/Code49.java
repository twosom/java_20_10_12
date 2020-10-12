import java.util.Scanner;

public class Code49 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max = 0;
		if(a > b) max = a;
		else max = b;
		
		if(c > max) max = c;
		
		System.out.println("max : " + max);
		scan.close();
		
	}

	
}
