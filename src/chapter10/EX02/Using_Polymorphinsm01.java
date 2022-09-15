package chapter10.EX02;

// 다형성(Polymorphism): 하나의 객체가 여러 가지 타입을 가질 수 있다
//	- 메서드 오버라이딩을 사용해서 부모 클래스의 메서드를 재정의해서 자식 클래스에서 재사용한다

// 상속을 사용한 다형적 표현
//	- 상속 관계에서 객체를 생성 시 부모 타입으로 선언할 수 있다
//	- 부모 타입으로 선언하면 부모 클래스의 필드와 메서드만 사용 가능
//	- 자식 객체를 생성하면서 부모 타입으로 지정하면 업캐스팅이 자동으로 됨
//	- 다시 자식 클래스의 필드와 메서드를 사용하려면 다운캐스팅을 해야 사용 가능

class A {}				// 부모 클래스
class B extends A {}	// 자식 클래스, 부모 A
class C extends B {}	// 자식 클래스, 부모 B
class D extends B {}	// 자식 클래스, 부모 B



public class Using_Polymorphinsm01 {

	public static void main(String[] args) {
		// 자식에서 객체 생성 후 부모 타입으로는 지정 가능
		// 부모에서 객체 생성 후 자식 타입으로는 지정 불가
		// 자식 => 부모 (O) / 부모 => 자식 (X)

		// 1. A 타입의 다형적 표현
			// a1은 A 타입만 내포하고 있고, A 타입으로 지정
		A a1 = new A();			// A 클래스는 A 타입이다: A는 A다 (O)
			// a2는 A, B 타입을 내포하고 있고, A 타입으로 지정
		A a2 = new B();			// B 클래스는 A 타입이다: B는 A다 (O)
			// a3는 A, B, C 타입을 내포하고 있고, A 타입으로 지정
		A a3 = new C();			// C 클래스는 A 타입이다: C는 A다 (O)
			// a4는 A, B, D 타입을 내포하고 있고, A 타입으로 지정
		A a4 = new D();			// D 클래스는 A 타입이다: D는 A다 (O)

		// 2. B 타입의 다형적 표현
//		B b1 = new A();			// A는 B이다 (X)
		B b2 = new B();			// B는 B이다 (O)
		B b3 = new C();			// C는 B이다 (O)
		B b4 = new D();			// D는 B이다 (O)
		
		// 3. C 타입의 다형적 표현
//		C c1 = new A();			// A는 C이다 (X)
//		C c2 = new B();			// B는 C이다 (X)
		C c3 = new C();			// C는 C이다 (O)
//		C c4 = new D();			// D는 C이다 (X)
		
		// 4. D 타입의 다형적 표현
//		D d1 = new A();			// A는 D이다 (X)
//		D d2 = new B();			// B는 D이다 (X)
//		D d3 = new C();			// C는 D이다 (X)
		D d4 = new D();			// D는 D이다 (O)
		
	}

}
