package chapter08.EX02;

// import를 사용하여 외부 패키지에 접근
	// 서로 다른 패키지에 있는 같은 이름의 클래스는 중복 임포트 불가 - 같은 패키지 내에 같은 클래스명이 2개 이상 존재하는 것으로 간주
	// 클래스의 풀네임을 부르는 용법을 사용하거나 임포트와 풀네임 혼용
import chapter08.EX01.A;
//import chapter08.EX01.com.A;

public class Using_Package02 {

	public static void main(String[] args) {

		// A 클래스는 동일한 패키지 내에 존재하지 않는다(import를 해서 사용)
		//		-- A class는 접근 제어자가 public, protected(상속) 지정되어 있어야 한다
		
		System.out.println("=====A 클래스(public)=====");
		A a = new A();
		System.out.println(a.m);		// 다른 패키지에서 접근
		System.out.println(a.n);
		a.print();
		
		System.out.println("=====B 클래스(default)=====");
		// B 클래스는 default 클래스이기 때문에 다른 패키지에서 사용 불가
		// B b = new B();
		
		// 동일한 이름을 가진 두 클래스 동시에 import 불가 - 풀네임을 사용하여 객체를 생성해야 한다
		System.out.println("=====또 다른 패키지에 존재하는 A 클래스 사용하기=====");
		chapter08.EX01.com.A aa = new chapter08.EX01.com.A();
		System.out.println(aa.aa);
		System.out.println(aa.bb);
		aa.print();

		
	}

}
