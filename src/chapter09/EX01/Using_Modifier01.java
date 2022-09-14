package chapter09.EX01;

public class Using_Modifier01 {

	public static void main(String[] args) {
		
		A a = new A();		// 객체 생성
		
		// 필드 출력
		System.out.println(a.a);		// public
		System.out.println(a.b);		// protected
		System.out.println(a.c);		// default
//		System.out.println(a.d);		// private	=> 동일한 클래스에서만 접근 가능
		
		// 메서드 출력
		a.print1();						// public
		a.print2();						// protected
		a.print3();						// default
//		a.print4();						// private => 접근 불가
	}

}
