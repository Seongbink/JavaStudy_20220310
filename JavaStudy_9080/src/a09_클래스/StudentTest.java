package a09_클래스;

public class StudentTest {
	/*
	 * 
	 * schoolName
	 * studentYear
	 * studentGroup
	 * studentNumber
	 * studentName
	 * studentAddress
	 * studentPhone
	 * graduationgFlag(boolean)
	 * 
	 * 기능(메소드)
	 * showStudentInfo()
	 * 학교명: 부산고등학교
	 * 학년: 3
	 * 반: 2
	 * 번호: 10
	 * 이름: 강성빈
	 * 주소: 부산 동래구
	 * 연락처: 010-9432-9080
	 * 졸업구분: true(졸업), false(재학중);
	 * 
	 * incrementYear()
	 * 학년 +1
	 * 학년 3학년을 넘어서면 graduationFalg = true;
	 * 
	 */


		public static void main(String[] args) {
			Student s1 = new Student("부산고등학교" , 1, 2 , 10, "강성빈" , "부산 동래구", "010-9432-9080", false);
					
					s1.incrementYear();
					s1.incrementYear();
					s1.incrementYear();
					s1.showStudentInfo();
					
					Student s2 = new Student("경남고등학교", "강성빈");
					
		}
	}

	/*public static void main(String[] args) {
		Student s1 = new Student();
		s1.schoolName = "부산고등학교";
		s1.studentYear = 1;
		s1.studentGroup = 2;
		s1.studentNumber = 10;
		s1.studentName = "강성빈";
		s1.studentAddress = "부산 동래구";
		s1.studentPhone = "010-9432-9080";
		s1.graduationFlag = false;
		
		s1.incrementYear();
		s1.incrementYear();
		s1.incrementYear();
		s1.showStudentInfo();
	}

}
*/