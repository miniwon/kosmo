package chapter09.EX04;

class Student02 {
	
	// 필드의 접근 지정자: default로 구성됨
	//		-- 외부 클래스에서 객체를 생성 후 직접 수정 가능
	static int serialNumber = 1000;			// 모든 객체에서 공유하는 필드, 객체를 생성할 때마다 1씩 증가
	int studentID ;		// 학생 고유 번호
	String studentName;		// 학생 이름
	int grade;				// 학년: 기본값을 4학년 지정
	String address;			// 주소: 기본값을 "서울"로 지정
	
}

class Student03 {
	
	// 필드의 접근 지정자는 보안을 위해 private으로 선언하는 경우가 많다
	//		-- 외부에서 필드의 값을 직접적으로 수정할 수 없다
	
	private static int serialNumber = 1000;			// 모든 객체에서 공유하는 필드, 객체를 생성할 때마다 1씩 증가
	private int studentID ;			// 학생 고유 번호
	private String studentName;		// 학생 이름
	private int grade;				// 학년: 기본값을 4학년 지정 (1~4)
	private String address;			// 주소: 기본값을 "서울"로 지정
	private int month;				// 값: 1~12까지만 가능
	
	//필드의 접근 지정자를 private으로 설정하면 외부 클래스에서 접근이 불가능하다
	//	- 생성자나 메서드(Setter)를 사용해서 필드의 내용을 수정
	//		- 원하는 값을 (제어해서) 입력할 수 있다
	
	Student03() {
		serialNumber++;
		studentID = serialNumber;
		grade = 4;
		address = "서울";
	}
	Student03(String studentName) {
		this();
		this.studentName = studentName;
	}
	
	void print() {
		System.out.println("학생 ID: " + studentID);
		System.out.println("학생 이름: " + studentName);
		System.out.println("학년: " + grade);
		System.out.println("주소: " + address);
		System.out.println("입력한 월: " + month);
		System.out.println();
	}
	
	public void setGrade (int grade) {		// setter: grade 필드값을 할당하는 setter
		
		if (grade >= 1 && grade <=4) {
			this.grade = grade;
		} else {
			System.out.println("잘못된 값을 입력했습니다. 1~4학년까지 입력이 가능합니다.");
			return;
		}
	}
	public void setMonth (int month) {
		if (month >= 1 && month <= 12) {
		this.month = month;
		} else {
			System.out.println("잘못된 값을 입력했습니다. 1~12월까지 입력이 가능합니다.");
			return;
		}
	}

}

public class Student_Test02 {

	public static void main(String[] args) {
		// 객체 생성
		Student02 s = new Student02();
		
		// default 접근 제어자: 동일한 패키지에 존재하는 클래스에서 필드의 값을 직접 수정
		s.serialNumber = 2000;
		s.studentID = 100;
		s.studentName = "홍길동";
		
		// 객체 생성
		Student03 s3 = new Student03("홍길동");
		
//		s3.serialNumber = 2000;
//		s3.studentID = 100;
//		s3.studentName = "홍길동";
		
		// 필드의 값을 직접 입력하는 경우 입력값을 제어할 방법이 없다
//		s3.grade = 100;		// 1~4		private인 경우 오류 발생
//		s3.month = 200;		// 1~12		private
		
		s3.setGrade(3);
		s3.setMonth(12);
		
		s3.print();
		
	}

}
