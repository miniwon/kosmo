package chapter02.EX02;

public class NamingVirableAndConstant {
	public static void main(String[] args) {
		
		/* 변수의 이름 부여
		 *  - 변수 이름은 영문, 한글 사용 가능(한글은 권장 X)
		 * 	- 첫 자는 소문자
		 *  - 특수 문자: _, $
		 *  - 첫 자에 숫자는 올 수 없다
		 *  - JAVA의 Keyword(예약어)는 올 수 없다 (ex. int, double, String..)
		 */
		
		boolean aBcD;		// aBcD 변수에 true, false
		aBcD = true;
		System.out.println(aBcD);
		aBcD = false;
		System.out.println(aBcD);
		byte 가나다;		//사용은 가능하나 권장 X
		short _abcd; 	//특수 문자는 _, $
		char $ab_cd;
		double main; 	//메서드 이름을 변수 이름으로 사용 가능
						//사용 방법이 다르기 때문에 사용 가능
		//float int;	//예약어를 변수명으로 사용하면 오류 발생
						//ex) class, int, double, char, byte..
		String myClassName;		//첫 글자는 소문자, 여러 단어가 있을 때 첫 글자는 대문자
		
		
		/* 상수의 이름 부여 - 상수: 값 변경 불가능
		 *  - 대문자로 처리
		 *  - 변수 선언문 앞에 final 키워드 사용
		 */
		
		final double PI;
		PI = 3.141592;
		
		System.out.println(PI);
		
		//PI = 1234.00;				//상수는 값을 수정할 수 없다
		System.out.println(PI);
				
		final int MY_DATA;		//상수는 _
		int myData;				//변수는 대문자
		

	}

}
