package chapter09.EX01;

public class E extends A {
	
	public void print() {
		System.out.println("=====부모의 필드 출력=====");
		System.out.println(a);			// public
		System.out.println(b);			// protected
		System.out.println(c);			// default
//		System.out.println(d);			// private
		
		System.out.println("=====부모의 메서드 호출=====");
		print1();
		print2();
		print3();
//		print4();
	}

}
