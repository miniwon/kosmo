package chapter07.EX02;

//class 외부에 올 수 있는 것(3가지)
//1. 패키지		2. 임포트(같은 패키지에 존재하지 않는 클래스)		3. 외부 클래스

class A {		//클래스: 객체를 생성하기 위한 설계도

//class 내부에 올 수 있는 것(4가지)
//1. 필드(클래스에서 선언된 변수)		2. 생성자		3. 메서드		4. 이너클래스

	//1. 필드
	int m;		//0		//필드는 Heap 메모리에 저장, 초기값을 넣지 않아도 강제 초기화
	int n;		//0
	double k;	//0.0
	String l;	//null
	
	//2. 생성자: 클래스 내에는 반드시 생성자가 존재해야 한다				특징: 1. 클래스 이름과 동일		2. 리턴이 존재하지 않아야 한다
	//		   기본 생성자(입력매개변수가 없는 생성자)는 생략될 수 있다
	//		   객체 생성시 생성자 호출
	//		   객체의 초기값을 세팅
	//		   기본 생성자는 생략되어 있을 경우 컴파일러가 자동으로 등록해 준다
	//		   클래스 내부에 다른 생성자가 존재할 시 컴파일러가 기본 생성자를 자동으로 만들어 주지 않는다
	A() {
		System.out.println("기본 생성자 호출");
	}
	
	//3. 메서드: <리턴타입> <메서드명>(입력매개변수) { 실행 코드; }
	//			프로그램의 기능을 코드로 작성
	//			호출해서 작동됨, work1()
	void work1() {
		System.out.println("work1() 메서드 호출");
	}
	
	//work2(정수, 정수)
	int work2 (int a, int b) {			//지역 변수: 메서드 블락에서 선언된 변수, Stack에 값이 저장
										//		   메서드가 종료되면 메모리에서 삭제된다
		System.out.println("work2 메서드 호출");
		
		return a + b;
	}
	
	//work3(정수, 실수, 문자열)
	double work3 (int a, double b, String c) {
		System.out.println("work3 메서드 호출");
		System.out.println(a + ", " + b + ", " + c);
		return a + b;
		
	}
	
	String work4 (String a) {
		
		return a;
	}
	
}

public class Using_Object {

	public static void main(String[] args) {
		//객체 생성: Main 메서드에서 생성
		
		//A 클래스의 객체 생성
		A a1 = new A();
		//A		: 클래스
		//a1	: 객체
		//new	: Heap 메모리에 객체를 생성하라
		//A()	: 클래스 내부의 생성자 호출, 기본 생성자: 입력매개변수가 없는 생성자, 생략될 수 있다
		
		//객체의 필드값 출력
		System.out.println(a1.m);		//0
		System.out.println(a1.n);		//0
		System.out.println(a1.k);		//0.0
		System.out.println(a1.l);		//null

		
		//객체의 필드값을 수정
		a1.m = 10;
		a1.n = 20;
		a1.k = 30.0;
		a1.l = "배고파요";

		System.out.println("=====객체의 필드 값을 수정=====");
		System.out.println(a1.m);
		System.out.println(a1.n);
		System.out.println(a1.k);
		System.out.println(a1.l);
		System.out.println("==========================");
		
		//메서드 호출(work1())
		a1.work1();			//매개변수가 존재하지 않는 메서드
		
		//메서드 호출(work2(정수, 정수))
		int k = a1.work2(10,20);	//매개변수가 2개인 메서드 호출		<<return a + b;
		System.out.println(k);
		System.out.println(a1.work2(40,50));
		System.out.println("==========================");
		
		//메서드 호출(work3(정수, 실수, 문자열)) - 리턴값: double
		double d = a1.work3(10, 20.0, "치킨");		//리턴받은 값을 변수에 할당 후 출력
		System.out.println(d);
		System.out.println("==========================");
		System.out.println(a1.work3(30,  30.0, "피자"));
		System.out.println("==========================");
		
		//메서드 호출(work4(문자열)) - 리턴값: String
		String e = a1.work4("오늘 점심은 뭐 먹지");
		System.out.println(e);
		
		System.out.println(a1.work4("하세요")); 		//인풋 값을 리턴
		
		//클래스		: 객체를 생성하기 위한 설계도				<= 클래스 영역에 저장
		//객체		: 클래스를 기반으로 만들어진 인스턴스(객체)	<= Heap 영역에 저장
		//인스턴스화	: 클래스는 객체화해야 사용이 가능하다		A a = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();
		
		
		
	}

}
