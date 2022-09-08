package chapter06.EX01;

//클래스(붕어빵 기계)와 객체(붕어빵)의 차이점
//	클래스: 객체를 만들기 위한 틀(붕어빵 기계, 설계도)
		//필드
		//생성자
		//메소드
		//이너클래스
//	객체 : 클래스를 틀로 해서 만들어진 RAM에 로드된 것(붕어빵, 건물)

//클래스를 객체로 만드는 작업을 인스턴스화라고 부른다

//외부 클래스(클래스명 첫 글자는 대문자)
class A {
	//필드: Heap 영역에 값이 저장, 값을 넣지 않으면 강제 초기화
	int m = 3;
	int n = 4;

	//기본 생성자: 클래스 이름과 동일한 메소드는 생성자, 리턴타입이 없다
		//객체를 생성할 때 초기값을 부여하는 역할
	A () {}
	
	//메소드: 호출시 작동
	void print() {
		int k = 10;		//지역 변수: Stack 영역에 값이 저장, 값을 넣지 않으면 비어 있다
		System.out.println(k);
		System.out.println(m + n);
	}
}

class B { 	//외부 클래스
	
}

public class Using_Class02 {

	public static void main(String[] args) {
		
		int aa; 	//지역 변수
		
		//객체 생성은 main 메소드에서 작성
		
		A a = new A();
		//A		: 참조 변수 타입: A
		//a		: 객체(참조 변수)
		//new	: Heap 메모리에 값을 넣어라, 객체를 생성해라
		//A()	: 기본 생성자 호출
		
		//객체의 필드 내용 출력
		System.out.println("==객체의 필드 값 출력==");
		System.out.println(a.m);	//필드의 m값 출력
		System.out.println(a.n); 	//필드의 n값 출력
		
		//객체의 메소드 호출
		System.out.println("==객체의 메소드 호출==");
		a.print();
		
	//=============================================================
		//A class: 특 => 객체화

		//A class를 틀로 해서 b 객체 생성
		A b = new A();
		
		System.out.println(b.m);	//3
		System.out.println(b.n);	//4
		
		//객체의 필드 값을 수정
		b.m = 30;			//필드의 값을 30으로 수정
		b.n = 40;			//필드의 값을 40으로 수정
		
		//필드의 내용을 출력
		System.out.println(b.m); 	//30
		System.out.println(b.n); 	//40
		
		//메소드 호출: 기능을 프로그래밍한 것
		System.out.println("==pring() 메소드 호출==");
		b.print();
		
		System.out.println("=====A class를 틀로 해서 객체를 무한정 생성=====");
		A c = new A();
		c.m = 30;
		c.n = 100;
		System.out.println(c.m);
		System.out.println(c.n);
		System.out.println("print() 메소드 호출");
		c.print();
		
	}

}
