package chapter09.EX02;

import chapter09.EX01.A;

// A 클래스와 다른 패키지에 존재하는 클래스: import 사용

public class Using_Modifier02 {

	public static void main(String[] args) {

		// 자동 import
		A a = new A();

		//ㅍ필드 접근
		System.out.println(a.a); 		// public
//		System.out.println(a.b);		// protected	: 접근 불가(다른 패키지에서 접근할 경우 상속 관계여야 한다)
//		System.out.println(a.c); 		// default		: 접근 불가(같은 패키지 내에서만 접근 가능)
//		System.out.println(a.d); 		// private		: 접근 불가
		
		// 메서드 접근
		a.print1(); 					// public
//		a.print2();						// protected	: 접근 불가
//		a.print3();						// default		: 접근 불가
//		a.print4();						// private		: 접근 불가
	
		System.out.println("=====상속 관계 객체 출력(D)=====");
		D d = new D();
		d.print();
		
	 }

}
