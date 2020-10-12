import java.util.Scanner;
public class Code48 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = scan.nextInt();
		System.out.println("Enter b : ");
		int b = scan.nextInt();
		
		
		int max = 0;
		if (a > b)
			max = a;
		else
			max = b;
		
		System.out.println("max : " + max);
		scan.close();
	}

}
