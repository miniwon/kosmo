package chapter04.EX04;

public class Using_For01 {

	public static void main(String[] args) {
		/*
		 * for(초기값; 조건; 증가값) {
		 * 		실행문1; 		<== 조건이 참일 동안 계속 반복,
		 * }						거짓이면 for문을 빠져나온다
		 * 
		 */

		int a;
		for (a = 0; a < 3; a++) {		//(초기값; 조건; 증가값)
			System.out.println(a);
		} 	//0 1 2
		
		System.out.println("===================");
		//초기값과 증가값에는 ,로 구분해서 여러 개의 변수가 올 수 있다
		
		int b, c, d;
		for (b = 0, c = 10, d = 20; b < 5; b++, c += 2, d += 5) { 	//5번 반복(b = 0, 1, 2, 3, 4)
					//b: 1씩 증가, c: 2씩 증가, d: 5씩 증가
			System.out.println("b: " + b + ", c: " + c + ", d: " + d);
		}
		System.out.println("===================");
		
		//for문에서 무한 루프 (조건이나 증가값을 잘못 처리할 경우 무한 루프에 빠짐)
		int e;
		for (e = 0; e < 10; e += 3) {
			System.out.println(e); 		//조건이 true일 때까지 반복
		} 		//0 3 6 9
		System.out.println("===================");
		
		//1부터 10까지 for문 없이 덧셈
		int sum1;
		sum1 = 0; 		//0
		sum1 += 1;		//sum1 = sum1 + 1
		sum1 += 2;		//sum1 = sum1 + 2
		sum1 += 3;		//sum1 = sum1 + 3
		sum1 += 4;		//sum1 = sum1 + 4
		sum1 += 5;		//sum1 = sum1 + 5
		sum1 += 6;		//sum1 = sum1 + 6
		sum1 += 7;		//sum1 = sum1 + 7
		sum1 += 8;		//sum1 = sum1 + 8
		sum1 += 9;		//sum1 = sum1 + 9
		sum1 += 10;		//sum1 = sum1 + 10
		System.out.println("1~10까지의 합: " + sum1);
		
		//for문을 이용하여 1부터 10까지의 합계 구하기
		int sum2;
		int i;
		for ( i = 1, sum2 = 0; i <= 10; i++) {
			sum2 += i;
			System.out.println("sum2: " + sum2 + ", i: " + i);
		}
		System.out.println("1~10까지의 합: " + sum2);

		//예제. for문을 사용해서 0~1000까지 7의 배수의 합계
		//7의 배수의 합계: 000
		int sum3;
		int h;
		for (h = 1, sum3 = 0; h*7 <=1000; h++) {
			sum3 += h*7;
			System.out.println("sum3: " + sum3 + ", h: " + h);
			System.out.println("7의 배수의 합계: " + sum3);
		}
		
		/* 정답
		 * int sum3 = 0;
		 * for (int h = 0; h <= 1000; h += 7) {
		 * 	sum3 += h;
		 * }
		 */
		System.out.println("===================");
		
		//for문과 if문을 사용해서 1~10까지 더한 값을 출력하되 아래와 같이 출력하세요
		//결과: 1+2+3+4+5+6+7+8+9+10 = 55
		int sum4;
		int q;
		for (q = 1, sum4 = 0; q <=10; q++) {
			sum4 += q;
			if (q < 10) {
				System.out.print(q + "+");
			} else {
				System.out.print(q + " = " + sum4);
			}
		}
			
		
	}

}
