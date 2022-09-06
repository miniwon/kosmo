package chapter04.EX06;

public class Using_DoWhile {

	public static void main(String[] args) {
		//While: 조건을 비교 후 실행문을 실행
		 /*
		  *  while (조건) {
		  * 	실행문;
		  *  }  
		  */
		
		//Do While: 한 번은 실행 후 조건을 비교 후 실행문을 실행;
		 /*
		  *  do {
		 * 		실행문
		 * } while (조건);
		 * 
		 */
		
		//1. while
		int a;
		a = 11;
		System.out.println("=======while문: 조건이 참일 때만 실행=======");
		while (a < 10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		System.out.println("======do while문: 조거노가 상관없이 실행문을 1번 실행 후, 조건이 참이면 반복=======");
		a = 11;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 10);
		
		System.out.println();
		//while문과 do while문 10 번 실행
		
		System.out.println("=========while=========");
		
		a = 0;
		while (a < 10) {
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
		System.out.println("=========do while=========");
		
		a = 0;
		do {
			System.out.print(a + " "); 		//조건과 관계없이 한 번은 실행
			a++;
		} while ( a < 10);
		
		
	}

}
