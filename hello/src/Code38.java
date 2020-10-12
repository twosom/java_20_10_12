
public class Code38 {

	public static void main(String[] args) {
		
		long x = 10000L;
		float y;
		y = x; //x가 long형에서 float형으로 자동으로바뀜.
		System.out.println(y);
		
		double z;
		z = x; // x가 float에서 double형으로 바뀜
		System.out.println(z);
	}
}
