package a09_클래스;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer c1 = null;
		Computer c2 = null;
		
		c1 = new Computer(); //생성(생성자 호출) ,,일련번호랑 유사
		c2 = new Computer(); //새로 만들어낸 주소를 c2에 담는다. 같은 값 아니다 c1,c2랑 다름
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.model = "삼성컴퓨터";
		c2.model = "LG컴퓨터";
		
		System.out.println(c1.model);
		System.out.println(c2.model);
		
		c1.printInfo();
		c2.printInfo();
		
	}

}
