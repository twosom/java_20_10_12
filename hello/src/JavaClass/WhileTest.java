package JavaClass;

public class WhileTest {

	public static void main(String[] args) {
		//image1.png, image3.png, image5.png 출력
		//3번출력
		//공통된 부분 image.png
		//패턴을 갖는 부분은 1,3,5
		
		int i = 0;
		while (i<=2) {
			System.out.println("image" + (i * 2 + 1) + ".png" );
			i = i + 1;
		}
	}
}
