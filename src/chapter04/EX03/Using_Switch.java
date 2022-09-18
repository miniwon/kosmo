package chapter04.EX03;

public class Using_Switch {

	public static void main(String[] args) {
		//switch문 - 반드시 break;를 사용해서 해당 case를 탈출
		
		//switch에서 break;를 사용하지 않는 경우
		//해당 case로 점프 후에 하위의 모든 case를 실행
		int a = 3;
		
		switch(a) {		//(위치변수): 정수, 문자, 문자열
		case 1:
			System.out.println("변수 값을 출력: " +a);
		case 2:
			System.out.println("변수 값을 출력: " +a);
		case 3:
			System.out.println("변수 값을 출력: " +a);
		case 4:
			System.out.println("변수 값을 출력: " +a);
		default:
			System.out.println("변수 값을 출력: " +a);
		}
		System.out.println("============================");

		//switch에서 break; 사용한 경우
		int b = 2;
		
		switch(b) {		//(위치변수): 정수, 문자, 문자열
		case 1:
			System.out.println("변수 값을 출력: " +b);
			break;
		case 2:
			System.out.println("변수 값을 출력: " +b);
			break;
		case 3:
			System.out.println("변수 값을 출력: " +b);
			break;
		case 4:
			System.out.println("변수 값을 출력: " +b);
			break;
		default:	//if문의 else와 같은 용도
			System.out.println("변수 값을 출력: " +b);
			//default에는 break; 생략
		}
		System.out.println("============================");
		
		//7점 이상인 경우 pass, 그렇지 않은 경우 fail
		int c = 8;
		
		switch (c) {
		case 10:
			System.out.println("Pass");
			break;
		case 9:
			System.out.println("Pass");
			break;
		case 8:
			System.out.println("Pass");
			break;
		case 7:
			System.out.println("Pass");
			break;
		default :
			System.out.println("Fail");
			break;
		}
		System.out.println("============================");
		
		//축약 표현
		c = 9;
		switch (c) {
		case 10: case 9: case 8: case 7:
			System.out.println("Pass");
			break;
		default :
			System.out.println("Fail");
			break;
		}
		System.out.println("============================");
		
		//switch문 <==> if ~ else if문 상호 변경 가능
		int d = 8;
		
		switch (d) {
		case 10: case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		default :
			System.out.println("D학점");
			break;
		}
		System.out.println("============================");
		
		//위 구문을 if, else if문으로 변환, break 없이도 자동으로 구문을 빠져나옴
		d = 7;
		if (d > 9) {
			System.out.println("A학점");
		} else if (d == 8) {
			System.out.println("B학점");
		} else if (d == 7) {
			System.out.println("C학점");
		} else {
			System.out.println("D학점");
		}
		
	}
	
	
	

}
