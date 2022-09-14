package chapter08.EX01;

// 접근 지정자: 캡슐화, 객체를 보호하기 위해서
//		클래스 이름 앞		: public, default(생략됨)
//		필드, 메서드 앞에	: public, protected, default(생략됨), private

//		* 클래스명, 필드명, 메소드명에는 반드시 접근 지정자가 할당되어 있다

//	1. public		: 동일 패키지의 모든 클래스 + 다른 패키지의 모든 클래스에서 사용 가능
//	2. protected	: 동일 패키지의 모든 클래스 + 다른 패키지의 자식 클래스에서 사용 가능
//	3. default		: 동일 패키지의 모든 클래스에서 사용 가능
//	4. private		: 동일 클래스에서만 사용 가능(같은 패키지의 다른 클래스, 다른 패키지의 클래스 사용 불가)

public class A {			// 동일 패키지의 모든 클래스 + 다른 패키지의 모든 클래스에서 접근을 허용(public)

	public int m = 3;
	public int n = 4;
	
	public void print() {
		System.out.println("임포트 test");
	}
	
}
