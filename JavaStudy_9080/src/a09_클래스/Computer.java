package a09_클래스;

public class Computer {
	String model;     //자동차공장이라고 생각하면 틀은 같지만 색상 내용부품 다른거 
	
	
	//생성자의 return 값은 무조건 주소값이다.
	public Computer() {
		System.out.println("컴퓨터 객체를 생서합니다.");
	}
	//메소드
	public void printInfo() {
		System.out.println("컴퓨터 모델: " + model);
	}
}
