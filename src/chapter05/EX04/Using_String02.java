package chapter05.EX04;

public class Using_String02 {

	public static void main(String[] args) {
		/*
		 * String 변수에 값 할당				//동일한 문자열일 경우
		 * 1. 객체 생성 방식으로 할당				//별도의 주소에 값 할당
		 * 2. 리터럴 방식으로 할당				//하나의 주소를 공유
		 * ==: 스택 공간의 값 비교				(기본 자료형: 스택 - 값)
		 * 									(참조 자료형: 스택 - 주소, 힙 - 값)
		 * 
		 * .equals(): 참조 자료형일 때 힙 영역의 값을 비교
		 */
		
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("====================================");
		
		// ==: 참조 자료형일 경우 Stack메모리에 저장된 Heap 메모리의 주소를 비교
		System.out.println(str1 == str4); 		// false
		System.out.println(str2 == str3);		// true
		
		// equals(): 참조 자료형의 Heap 메모리 값을 비교
		System.out.println(str1.equals(str2));	// true
		System.out.println(str2.equals(str3));	// true
		System.out.println(str3.equals(str4));	// true
		

	}

}
