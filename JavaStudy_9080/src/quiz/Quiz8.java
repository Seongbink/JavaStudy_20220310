package quiz;
/*
 * 1 ~2001
 * 윤년이면 출력 아니면 
 * 4의배수,100의배수는 아니면서 400의 배수 
 */

public class Quiz8 {

	public static void main(String[] args) {
	
		for(int i=0; i < 2001; i++ ) {
			int year = i + 1;
			if(!(year % 4 ==0 && year % 100 != 0 || year % 400 ==0 )) {
			continue;
			}
			System.out.println(year);
		}
	}

}
