
public class Code56_infinity_Loop {
	
	public static void main(String[] args) {
		int i = 1, sum = 0;
		
		for(;;) {	//무한 루프를 만들려면 조건을 모두 비움.
			sum += i;
			i ++;
			if(i == 11)
				break;	//무한 루프인 경우 반드시 break 구문이 필요하다.
		}
		System.out.println("sum = " + sum);
	}

}
