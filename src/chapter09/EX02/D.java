package chapter09.EX02;

import chapter09.EX01.A;

public class D extends A {

	public void print() {
		
		System.out.println("=====부모 클래스의 필드 출력(다른 패키지)=====");
		System.out.println(a);		// public		: 다른 패키지에서 접근 가능
		System.out.println(b);		// protected	: 다른 패키지에서 접근 가능(상속 시)
//		System.out.println(c);		// default
//		System.out.println(d);		// private
		
		// 메서드 접근
		System.out.println("=====부모 클래스의 메서드 출력=====");
		print1();					// public
		print2();					// protected
//		print3();					// default
//		print4();					// private

	}
	
	
}
