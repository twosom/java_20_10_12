
public class Code26 {

	public static void main(String[] args) {
		
		int x = 20;
		int a = 2;
		int r1= x >> a;		//0001 0100 -> 0000	0101
		int r2 = x >>> a;	//0001 0100 -> 0000	0101
		int r3 = x << a;	//0001 0100 -> 0101 0000 -> 80?
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
	}
}

//Shift연산자는 + 또는 * 연산에 비해서 연산 속도가 빠르다는 장점이 있다.