package chapter07.EX03;

class A {
	//클래스 내부에 생성자가 존재하지 않는 경우 컴파일러가 기본 생성자를 자동으로 생성
	// A () {}
	
	//필드(인스턴스 필드: 객체 생성 후 호출 가능)
	int m;

	//메서드(인스턴스 메서드: 객체 생성 후 호출 가능)
	void work() {
		System.out.println(m);
	}
}

class B {
	//1. 필드
	int m;
	
	//2. 생성자
	B () {}			//기본 생성자: 명시
	
	//3. 메서드
	void work() {
		System.out.println(m);
	}
}

class C {
	//1. 필드
	int m;
	
	//2. 생성자: 매개변수가 하나인 생성자
		//클래스 내부에 생성자가 존재하면 컴파일러가 기본 생성자를 만들지 않는다
	C (int a) {					//입력매개변수, 입력매개변수를 받는 변수, 필드의 변수 3개의 이름이 동일할 때
		m = a; 					//필드의 변수에 this를 사용해야 한다
	}
	
	//3. 메서드
	void work() {
		System.out.println(m);
	}
}


public class Using_Constuctor01 {

	public static void main(String[] args) {
		//객체 생성
		A a = new A();			//기본 생성자 호출: A(), 생성자 생략된 경우(컴파일러가 자동으로 생성)
		
		System.out.println(a.m);
		a.work();
		System.out.println("======================");
		
		B b = new B();			//기본 생성자 호출: B()
		System.out.println(b.m);
		b.work();
		
		//오류 발생
		//C c = new C();			//생성자가 클래스 내부에 하나라도 존재하면 기본 생성자를 자동으로 만들지 않는다
		
		C c = new C(10);			//필드의 값을 초기화할 때 생성자 사용
		System.out.println(c.m);
		c.work();
	}

}
