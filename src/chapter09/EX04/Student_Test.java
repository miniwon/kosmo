package chapter09.EX04;

class Student {
	
	static int serialNumber = 1000;			// 모든 객체에서 공유하는 필드, 객체를 생성할 때마다 1씩 증가
	int studentID ;		// 학생 고유 번호
	String studentName;		// 학생 이름
	int grade;				// 학년: 기본값을 4학년 지정
	String address;			// 주소: 기본값을 "서울"로 지정
	
	Student (String studentName) {
		this.studentID = ++serialNumber;	// 모든 객체에서 공유하는 필드, 객체를 생성할 때마다 1씩 증가
		this.studentName = studentName;
		this.grade = 4;
		this.address = "서울";
	}
	Student (String studentName, int grade) {
		this(studentName);
		this.grade = grade;
	}
	Student (String studentName, int grade, String address) {
		this(studentName, grade);
		this.address = address;
	}

	void print() {
		System.out.print("고유 번호: " + studentID + "\t이름: " + studentName + "\t학년: " + grade + "\t주소: " + address);
		System.out.println();
	}
	
}

public class Student_Test {

	public static void main(String[] args) {
		// 객체를 생성할 때 자동으로 학번이 1000부터 1씩 자동으로 증가됨
		// studentID: 1000부터 학생 객체를 생성할 때마다 고유한 값으로 적용되어 있어야 한다
		
		Student lee = new Student("이지원");					//1001
		Student hong = new Student("홍지원", 3, "인천");		//1002
		Student jung = new Student("정지원", 2, "안양");		//1003
		Student park = new Student("박지원", 1);				//1004
	
		lee.print();
		hong.print();
		jung.print();
		park.print();
		

	}

}
