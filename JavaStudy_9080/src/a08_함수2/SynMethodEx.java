package a08_함수2;

import java.util.Scanner;

public class SynMethodEx {

	public static int test(int money) {
		System.out.println(money);
		System.out.println(money + " 를 굴린다.");
		System.out.println("테스트 출력");
		return money*2;		
	}
	/*
	 * 숫자 4개를 입력받는다.
	 * a,b,c,d
	 * 숫자 4개를 모두 입력받아서 리턴하여 total 변수를 출력하시오.
	 */
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}

	
	public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int total = 0;
		
		System.out.println("4개의 수를 입력하세요:");
		a =sc.nextInt();
		b =sc.nextInt();
		c =sc.nextInt();
		d =sc.nextInt();
		
		
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		System.out.println("c =" + c);
		System.out.println("d =" + d);
		
		
		
		total = sum(a,b,c,d);
		System.out.println("total =" + total);
	}

}
