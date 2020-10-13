package JavaClass;

public class ArrayCreate {
	
	public static void main(String[] args) {
		String [] Country = {"Korea", "United States", "England", "India", "North Korea"};
		String [] Country_Short = {"KOR", "USA", "ENG", "IND", "DPRK"};
		int [] Country_Population = new int[5];
		Country_Population[0] = 51841786;
		Country_Population[1] = 331002647;
		Country_Population[2] = 67886004;
		Country_Population[3] = 138004385;
		Country_Population[4] = 25778815;
		
		for(int i = 0; i <= Country.length - 1; i ++) {
			System.out.printf("나라 이름 : %s\n약어 : %s\n인구수 : %d명\n", Country[i], Country_Short[i], Country_Population[i]);
			System.out.println("----------------------");
			
		}
	}

}
