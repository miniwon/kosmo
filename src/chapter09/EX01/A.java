package chapter09.EX01;

// 클래스의 접근 지정자	: public, default(생략)
// 필드, 생성자, 메서드	: public, protected, default, private
// 1. public		: 동일 패키지의 모든 클래스 + 다른 패키지의 모든 클래스
// 2. protected	: 동일 패키지의 모든 클래스 + 다른 패키지의 자식 클래스(상속)
// 3. default		: 동일 패키지의 모든 클래스
// 4. private		: 동일 클래스(같은 패키지의 다른 클래스, 다른 패키지의 클래스 사용 불가)

public class A {

	public int a = 10;		// 같은 패키지, 다른 패키지
	protected int b = 20;	// 같은 패키지, 다른 패키지(상속)
	int c = 30;				// 같은 패키지
	private int d = 40;		// 같은 클래스
	
	// 메서드의 접근 제어자
	public void print1 () {
		System.out.println("A 클래스 출력 - public");
	}
	protected void print2() {
		System.out.println("A 클래스 출력 - protected");
	}
	void print3() {
		System.out.println("A 클래스 출력 - default");
	}
	private void print4() {
		System.out.println("A 클래스 출력 - private");
	}
	
}
