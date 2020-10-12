package JavaClass;

public class 과제1 {
	public static void main(String[] args) {
		int count = 0;
		for(int i =2; i<= 1000; i+=1) {
			boolean flag = false;
			for (int j =2; j <= i/2; j+=1) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				count += 1;
			}
		}
		System.out.println(count);
	}

}

//***
// **
//  *
// **
//***