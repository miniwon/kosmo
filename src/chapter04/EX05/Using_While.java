package chapter04.EX05;

public class Using_While {

	public static void main(String[] args) {
		/*while (조건) {
		 	실행문;
		}
		
			- while문은 반복 횟수를 알 수 없는 경우 사용
			- for문은 반복 횟수를 알 수 있는 경우 사용
		
			- 초기값 선언을 반드시 while 밖에서 해야 한다 <while문 안에서 선언 시 무한 루프>
			- 증가값은 while 내에서 선언을 함. <증가값을 선언하지 않으면 무한 루프>
		
		*/
		
		//1. while문에서 반복 횟수가 0인 경우
		System.out.println("==========반복 횟수 0==========");
		int a = 0; 	//변수의 초기값은 while 밖에서 선언
		while (a < 0 ) {  	//false
			System.out.print(a + " "); 		//조건이 True일 때만 실행
			
		}
		
		//2. while문에서 반복 횟수가 1인 경우(break)
		System.out.println("==========반복 횟수 break==========");
		a = 0;
		while (a == 0) {
			System.out.print(a + " ");
			break;
		}
		
		//3. while문 내에서 반복 횟수가 1인 경우
		a = 0;
		while ( a == 0) {
			System.out.println("==========반복 횟수 1 (증가값을 사용)==========");
			System.out.println(a);
			a++;
		}
		System.out.println("==========반복 횟수 10 (증가값을 사용)==========");
		a = 0;
		while (a < 10 ) { 
			System.out.print(a + " ");
			a++;					//증가값은 while내에서 처리
		}
		
		
		System.out.println();
		System.out.println("=====초기값을 while문 내에 넣는 경우: <무한 루프>");
		
		while ( a < 10) {
			a = 0;							//초기화 값을 while문 내에서 선언하면 무한 루프
			System.out.print(a + " ");
			a++;							//증가값은 while 내에서 처리
		}
		
		
		//while문은 조건을 생략할 수 없다
		//for문은 조건을 생략 시 무한 루프
		//while문에서 무한 루프를 돌릴 때 조건에 true
		
		System.out.println();
		System.out.println("======================");
		
		a = 0;
		boolean b;
		b = true;
		while (b) {
			System.out.print(a + " ");
			a++;
			if (a > 200 ) {
				break;	
			}
		}
		
	}

}
