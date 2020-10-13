package JavaClass;

public class Mbps변환 {
	
	public static void main(String[] args) {
		//Mbps값을 받아서 MB/s단위로 변환
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Mbps값을 MB/s값으로 변환합니다.");
		System.out.print("Mbps수치를 입력해주세요.");
		double Mbps = scan.nextDouble();	//Mbps값을 double형식으로 input받음
		
		double result = Mbps * 0.125;	//Mbps값을 MB/s값으로 변환.
		
		System.out.printf("%.2fMbps => %.2fMB/s", Mbps, result);
		scan.close();
		
	}
}
