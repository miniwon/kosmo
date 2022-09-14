package chapter09.EX05;

class A {

	void abc() {
		System.out.println("인스턴스 메서드");
	}
	static void bcd() {
		System.out.println("정적 메서드");
	}
}

public class Using_StaticMethod01 {

	public static void main(String[] args) {
		// 객체 생성 없이 바로 호출: 정적 메서드(클래스명.메서드명())
//		A.abc();		// 인스턴스 메서드: 객체 생성 후 객체명으로 호출
		A.bcd();
		
		// 객체 생성 후 호출
		System.out.println("==========");
		A a = new A();
		
		a.abc();		// 인스턴스 메서드
		a.bcd();		// 정적 메서드

	}

}
