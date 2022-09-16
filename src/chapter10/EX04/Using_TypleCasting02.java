package chapter10.EX04;

class Aa {
	
	int a = 10;
	void a() {
		System.out.println("A Class 출력");
	}
}

class Bb extends Aa {			// 자식 클래스 객체를 생성 시 부모 클래스의 기본 생성자를 호출하여
								//	 부모 클래스가 먼저 생성된 이후 자식 클래스가 생성된다
	int b = 20;
	void b() {
		System.out.println("B Class 출력");
	}	
}
class Cc extends Bb {
	int c = 30;
	void c() {
		System.out.println("C Class 출력");
	}
}

public class Using_TypleCasting02 {

	public static void main(String[] args) {
		// 다형성: 상속 관게일 때 하나의 객체를 여러 타입으로 정의해서 사용이 가능하다
		
		// 1. Aa 객체를 Aa 타입으로 생성
			// aa1는 Aa 타입만 내포, Aa를 타입으로 지정
			// aa1은 Aa의 필드나 메서드만 사용 가능
		System.out.println("=====1. Aa 객체를 Aa 타입으로 생성=====");
		Aa aa1 = new Aa();
			System.out.println(aa1.a);
			aa1.a();
			
		// 2. Bb 객체를 Bb 타입으로 생성
			// bb1는 Aa, Bb를 내포, Bb를 타입으로 지정
			// bb1는 Aa, Bb의 필드와 메서드 모두 사용 가능
		System.out.println("=====2. Bb 객체를 Bb 타입으로 생성=====");
			Bb bb1 = new Bb();
			// Aa 타입의 필드와 메서드 출력
				System.out.println(bb1.a);
				bb1.a();
			// Bb 타입의 필드와 메서드 출력
				System.out.println(bb1.b);
				bb1.b();
			
			// bb1을 Aa 타입으로 업캐스팅
				Aa aa2 = bb1;		// (Aa)bb1이라고 적지 않아도 자동으로 업캐스팅
				// aa2는 Aa의 필드와 메서드만 접근 가능
				System.out.println(aa2.a);
				aa2.a();
			// aa2를 Bb 타입으로 다운캐스팅
				Bb bb2 = (Bb)aa2;
				System.out.println(bb2.a);
				System.out.println(bb2.b);
				bb2.a();
				bb2.b();
				
			// 업캐스팅은 구문에서 오류가 바로 발생
			// 다운캐스팅은 구문에서 오류가 발생되지 않지만 실행 시에 오류가 발생
			//	instanceof()를 사용해서 오류가 발생하지 않도록 검사가 필요
				if (bb1 instanceof Cc) {			// bb1 객체에 Cc 타입을 내포하고 있을 때 True 리턴
					Cc cc1 = (Cc) bb1;	
				} else {
					System.out.println("bb1은 Cc 타입을 내포하고 있지 않습니다");
				}
				
				if (bb1 instanceof Aa) {			// bb1이 Aa 타입을 내포하면 True, 아니면 False
					Aa aa10 = (Aa) bb1;
					System.out.println("Aa 타입을 내포하고 있습니다");
				} else {
					System.out.println("Aa 타입을 내포하고 있지 않습니다");
				}
			
			System.out.println("==========");
			
			// 3. Cc 객체를 Aa타입으로 생성
				// aa20은 Aa, Bb, Cc를 내포, Aa 타입으로 지정
				// aa20은 Aa의 필드와 메서드만 사용 가능
			Aa aa20 = new Cc();
				System.out.println(aa20.a);
				aa20.a();
			// 다운캐스팅을 할 때는 instanceof()를 사용해야 한다
				if ( aa20 instanceof Bb) {		// Bb30은 블록 안에서 선언된 지역 변수이므로 대괄호 밖에서는 사용할 수 없다
					Bb bb30 = (Bb)aa20;			// 다운캐스팅은 자료형을 명시
					System.out.println(bb30.a);
					System.out.println(bb30.b);
					bb30.a();
					bb30.b();
				}
				if ( aa20 instanceof Cc ) {
					Cc cc30 = (Cc) aa20;
					System.out.println(cc30.a);
					System.out.println(cc30.b);
					System.out.println(cc30.c);
				}

	}

}
