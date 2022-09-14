package chapter07.EX05;

class Car {
	
	// this. 키워드	: 필드나 메서드 선언 시 사용 불가
	//				 - 생성자, 메서드 내부에서 필드나 메서드를 사용할 때 자신의 객체 필드나 메서드를 지칭
	//				 - 자신의 객체의 필드, 메서드를 가리킨다
	//				 - 반드시 사용해야 하는 경우: 메소드, 생성자에서 필드와 지역 변수의 이름이 같을 때(기본적으로는 생략해서 많이 사용)
	// this() 메서드	: 자신이 속한 클래스의 다른 생성자를 호출
	//				 - 생성자 내부에서만 사용, 반드시 첫 라인에 위치해야 한다
	//				 - 생성자를 오버로딩할 때 코드를 간략하게 해 주는 수단
	
	String companyName;		// 초기값: 현대자동차
	String color;			// 초기값: 검정색
	double maxSpeed;		// 초기값: 200.0 km/h
	
	// 생성자
	Car() {			// 생성자는 리턴 타입이 없다, 클래스명과 동일해야 한다
		this.companyName = "현대자동차";		// this 키워드 생략시 자동으로 컴파일러가 할당
		this.color = "검정색";
		this.maxSpeed = 200.0;
	}
	Car(String companyName) {
		this();								// 기본 생성자를 호출하는 this() 메서드
		this.companyName = companyName;		// 필드명과 지역 변수의 이름이 같기 때문에 필드명에 this 키워드 부여
	}
	Car(String companyName, String color) {
		this(companyName);
		this.color = color;
	}
	Car(String companyName, String color, double maxSpeed) {
		this(companyName, color);
		this.maxSpeed = maxSpeed;
	}
	
	// 필드의 모든 값을 출력하는 메서드
	void print() {
		System.out.println("차 이름: " + companyName);
		System.out.println("차 색상: " + color);
		System.out.println("최고 속도: " + maxSpeed + "km/h");
	}
}

public class ThisMethod04 {

	public static void main(String[] args) {
		// 1. 입력매개변수 0개, 기본 필드값 출력
		System.out.println("===입력매개변수 0개===");
		Car car1 = new Car();
		car1.print();
		
		// 2. 입력매개변수 1개, companyName만 출력, 나머지는 기본 필드값 출력
		System.out.println("===입력매개변수 1개===");
		Car car2 = new Car("기아자동차");
		car2.print();
		
		// 3. 입력매개변수 2개, companyName과 color 출력, maxSpeed는 기본 필드값 출력
		System.out.println("===입력매개변수 2개===");
		Car car3 = new Car("포르쉐", "빨강색");
		car3.print();
		
		// 4. 입력매개변수 3개, 모두 출력
		System.out.println("===입력매개변수 3개===");
		Car car4 = new Car("쉐보레", "노란색", 240.0);
		car4.print();
		
	}

}
