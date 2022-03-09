package a11_상속;

public class Eagle extends Animal{
	@Override // 어노테이션
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
		// super 부모의 주소
	}
	public void flying() {
		System.out.println("독수리가 날고있습니다.");
	}
}
