package a06_조건;

public class SwitchEx {

	public static void main(String[] args) {
		int select = 2;
		
		switch(select) {
			case 1 :
				System.out.println("1을 선택하셨습니다.");
				break;
			case 2 :
				System.out.println("2를 선택하셨습니다.");
				break;
			case 3 :
				System.out.println("3을 선택하셨습니다.");
				break;
				default:
					System.out.println("해당 case는 없습니다.");
		}
		String select2 = "강성빈";
		
		switch(select2) {
		case "강성빈" :
			System.out.println("선택하신 이름은 강성빈 입니다.");
			break;
		case "강성빔" :
			System.out.println("선택하신 이름은 강성빔 입니다.");
		case "강성범" :
			System.out.println("선택하신 이름은 강성범 입니다.");
		}
		
		int num = 21;
		/*if(num == 0) {
			System.out.println("0 입니다.");
		}*/
		switch(num == 0 ? 2 : num % 2) {
			case 0:
				System.out.println("짝수입니다.");
				break;
			case 1:
				System.out.println("홀수입니다.");
				break;
				default :
					System.out.println("num이 0 입니다.");
		}
	}

}
