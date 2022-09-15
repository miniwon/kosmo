package chapter10.EX01;

// 클래스 내부 구성 요소: 1. 필드, 2. 메서드, 3. 생성자, 4. 이너 클래스

// 클래스 외부 구성 요소: 1. 패키지, 2. 임포트, 3. 외부 클래스

// 상속(Inheritance): 객체 지향 언어의 꽃
//		- 부모 클래스(Super Class)의 필드와 메서드, 이너 클래스를 자식 클래스에 물려준다
//		- 자식 클래스(Child Class)는 부모 클래스의 코드(
//		- 중복되는 코드를 방지할 수 있다 - 코드를 간결하게 사용
//		- 유지 보수를 아주 쉽게 한다
//		- 다형성 사용: 부모 클래스의 메서드를 자식 클래스에서 재정의하여 사용
//			- 다양한 타입으로 사용 가능

// 부모 클래스(Super Class): 자식 클래스의 공통적인 특징을 가지는 클래스

class Human {			// 사람	: 부모 클래스, 자식 클래스의 공통적인 요소(필드, 메서드)를 보유
	// 필드
	String name;
	int age;
	
	//메서드 정의
	void eat() {
		System.out.println("모든 사람은 먹는다");
	}
	void sleep() {
		System.out.println("모든 사람은 잔다");
	}
	void print() {
		System.out.println(name + ", " + age + "살");
	}
}

//자식 클래스(Child Class): 부모 클래스의 필드와 메서드를 그대로 상속받는다
//	- 자식 클래스만의 특징이 적용된 필드와 메서드를 선언
class Student extends Human {			// Student class는 Human class를 상속받는다
	// 부모 클래스의 필드와 메서드가 그대로 내려온다
	// 자식 클래스의 특징을 가진 필드와 메서드를 선언
	int studentID;			// 자식 클래스에서 선언된 필드
	void goToSchool() {		// 자식 클래스에서만 사용 가능한 메서드
		System.out.println("학생이 학교에 갑니다");
		System.out.println(studentID + "번");
	}
	
}

class Worker extends Human {			// 직장인
	// 부모 클래스의 필드와 메서드가 그대로 내려온다
	int workerID;
	void goToWork() {
		System.out.println("직장인이 일하러 갑니다");
		System.out.println(workerID + "번");
	}
	
}

class Professor extends Human {		// 교수
	// 부모 클래스의 필드와 메서드가 그대로 내려온다
	int professorID;
	void goToCollage() {
		System.out.println("교수가 대학에 갑니다");
		System.out.println(professorID + "번");
	}
}

public class Using_Intheritance01 {

	public static void main(String[] args) {
		// 1. Human 클래스 객체 생성
		System.out.println("=====Human 객체 출력=====");
		Human h = new Human();
		
		h.name = "홍길동";
		h.age = 30;
		
		h.eat();
		h.sleep();
		h.print();
//		h.studentID;		// 부모 클래스에서는 자식 클래스의 필드를 사용할 수 없다

		// 2. Student 클래스 객체 생성(자식)
		System.out.println("=====Student 객체 출력=====");
		Student s = new Student();
		
		s.name = "세종대왕";
		s.age = 17;
		s.studentID = 1000;
		
		s.eat();
		s.sleep();
		s.print();
		s.goToSchool();
		
		// 3. Worker 클래스 객체 생성(자식)
		System.out.println("=====Worker 객체 출력=====");
		Worker w = new Worker();
		
		w.name = "신사임당";
		w.age = 40;
		w.workerID = 1001;
		
		w.eat();
		w.sleep();
		w.print();
		w.goToWork();
		
		// 4. Professor 클래스의 객체 생성(자식)
		System.out.println("=====Professor 객체 출력=====");
		Professor p = new Professor();
		
		p.name = "이순신";
		p.age = 50;
		p.professorID = 1002;
		
		p.eat();
		p.sleep();
		p.print();
		p.goToCollage();

	}

}
