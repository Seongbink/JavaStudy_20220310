package a07_Continue;

public class ContinueEx {

		/*
		 * continue -> 
		 * 
		 */
	public static void main(String[] args) {
		for(int i=0; i <5; i++) {
			if( i != 0 && i%2 == 0) {
				continue;
			}
			if(i == 3) {
				break;
			}
			System.out.println(i);
		}
	}

}
