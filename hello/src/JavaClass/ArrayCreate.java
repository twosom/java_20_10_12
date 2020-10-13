package JavaClass;

public class ArrayCreate {
	
	public static void main(String[] args) {
		String [] Country = {"Korea", "United States", "England", "India", "North Korea"};
		String [] Country_Short = {"KOR", "USA", "ENG", "IND", "DPRK"};
		int n = Country.length; // 데이터의 빠른 접근을 위해서 변수 n에 length저장.
		int [] Country_Population = new int[n];
		Country_Population[0] = 51841786;
		Country_Population[1] = 331002647;
		Country_Population[2] = 67886004;
		Country_Population[3] = 138004385;
		Country_Population[4] = 25778815;
		
		
		
		//반복문을 사용하면 유지보수가 수월해
		//배열의 속성으로 설정 - 데이터가 변경이 되도 출력하는 부분을 수정할 필요가 없어지게 됨.
		for(int i = 0; i <= n - 1; i ++) {
			System.out.printf("나라 이름 : %s\n약어 : %s\n인구수 : %d명\n", Country[i], Country_Short[i], Country_Population[i]);
			System.out.println("----------------------");
			
		}
		for(String name : Country) {
			System.out.println(name);
		}
		//.으로 접근하거나 [인덱스] 로 접근하게 되면
		//메모리를 한 번 더 찾아가야됨.
		//반복문 등에서 동일한 데이터를 여러 번 . 이나 [인덱스]를 이용해서 찾아가게 되면
		//비효율적임.
		//이런 경우에는 이 데이터를 가까운 곳에 저장해두고 접근하는 것이 좋음.
	}

}
