package chapter07.EX01;

public class Using_Method03 {

	//인스턴스 필드 
	int c;				//인스턴스 필드: static 키워드가 붙지 않는 필드(객체화 후 사용 가능)
	int d;
	
	//static 필드: 객체화 없이 바로 사용 가능
	static int e;
	static int f;
	
	//인스턴스 메서드: 객체화해야만 사용 가능
	void abc() {		//클래스 블럭에서 선언해서 오류 X, main 메서드 내에서 선언하면 오류
		System.out.println("abc() 메서드 호출");
	}
	
	//static 메서드: 객체화 없이 호출 가능
	static void def() {
		System.out.println("def() 메서드 호출");
	}
	
	//Static 메서드 내부의 인스턴스 필드나 메서드는 바로 사용할 수 없다(객체화시켜야 사용)
	
	
	public static void main(String[] args) {
		//main 메서드도 하나의 메서드이다
		int a; 		//지역 변수이다		<= Stack에 저장, Stack 영역이기에 강제 초기화 X
									// Stack에 값이 저장, main() 메서드 내에서만 사용
		
		a = 10;
		
		System.out.println(a); 		//초기값을 넣지 않고 출력시 오류 발생
		
		//main 메서드 내부의 메서드 선언 불가
		//메서드는 클래스 블록에서 선언되어야 한다
		/* 오류 발생
 		void abc() {
 			System.out.println("안녕하세요");
 		}
		*/
		
		//필드명, 메서드명 앞에 static 키워드가 적용되어 있으면 객체 생성 없이 호출
		//		static 메서드 내에서 인스턴스 필드나 인스턴스 메서드를 사용할 수 없다
		//		static 메서드 내에서 static 필드나 static 메서드를 사용할 수 있다
		
		//c = 5;		//오류 발생(static 메서드 내부에서 인스턴스 필드 직접 호출(X))
		e = 10;		//같은 클래스 내에서 직접 호출, static 필드 호출
		
		//abc();		//인스턴스 메서드 (오류 발생)
		def();		//static 메서드 (직접 호출)

	}

}
