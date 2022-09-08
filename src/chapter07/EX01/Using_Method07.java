package chapter07.EX01;

public class Using_Method07 {
	
	static void print() {
		System.out.println("입력된 데이터가 없습니다 - 매개변수 없음");
	}

	static void print (int a) {
		System.out.println(a + ": 값이 입력되었습니다 - 매개변수: 정수1");
	}
	/*static void print (int c) {
		//시그니처(매개변수의 타입과 개수)가 같아서 오류 발생 - 메서드명 + 매개변수의 타입 + 매개변수의 개수
	}*/
	
	static void print (double a) {
		System.out.println(a + ": 값이 입력되었습니다 - 매개변수: 실수1");
	}
	
	static void print (int a, int b) {
		System.out.println(a + ", " + b + ": 값이 입력되었습니다 - 매개변수: 정수1 정수1");
	}
	
	static void print (double a, double b) {
		System.out.println(a + ", " + b + ": 값이 입력되었습니다 - 매개변수: 실수1 실수1");
	}

	static void print (int a, double b) {
		System.out.println(a + ", " + b + ": 값이 입력되었습니다 - 매개변수: 정수1 실수1");
	
	}
	
	/*
	 * 위의 메서드와 시그니처가 동일함
	 * static int print (int c, double d) {
	 * 		system.out.println("시그니처가 중복됨");
	 * }
	 */
	
	
	public static void main(String[] args) {
		//메서드 오버로딩(Method Overloading)
		//		: 동일한 메서드 이름에 대해서 시그니처가 다른 경우 다른 메서드로 인식한다
		//			시그니처(식별자): 메서드명, 입력매개변수 타입, 입력매개변수 개수
		//				* 리턴 타입은 시그니처가 아니다
		//메서도 오버라이딩(Method Overriding): 상속
		//		: 부모 클래스에서 정의된 메서드를 자식 클래스에서 재정의해서 사용하는 것

		//매개변수 없음: print()
		print();
		System.out.println("==========");
		//매개변수 정수: print(정수)
		print(10);
		System.out.println("==========");
		//매개변수 실수: print(실수)
		print(20.0);
		System.out.println("==========");
		//매개변수 정수2: print(정수, 정수)
		print(30, 40);
		System.out.println("==========");
		//매개변수 실수2: print(실수, 실수)
		print(10.1, 20.1);
		System.out.println("==========");
		//매개변수 정수1 실수1: print(정수, 실수)
		print(50, 6.4);
		System.out.println("==========");
		
	}

}
