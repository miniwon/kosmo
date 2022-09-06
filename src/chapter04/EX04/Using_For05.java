package chapter04.EX04;

import java.util.Scanner;

public class Using_For05 {

	public static void main(String[] args) {
		//이중 for문 사용하기 (for문 내부의 for문)
		/*for (int i = 0; i < 5; i++) { 			//5 번 반복: 0, 1, 2, 3, 4
			for (int j = 0; j <10; j++) {		//10번 반복
				System.out.println("i: " + i + ", j: " + j);
			}
			System.out.println();
		} 
		 */
		//이중 for문을 사용해서 1단~9단까지 출력
		/*\n: enter, \t: tab
		 * 1*1=1	1*2=2	1*3=3	.....	1*9=9
		 * 2*1=2	2*2=4	.............	2*9=18
		 * ...
		 * 9*1=9	9*2=18 ..............	9*9=81
		 */
		
		for (int a = 1; a <=9; a++) {
			for (int b = 1; b <= 9; b++) {
				System.out.print(a + "*" + b + "=" + a*b + "\t");
			}
			System.out.println();
		}
		System.out.println("========================");
		
		//1단~19단까지 3의 배수인 단만 출력
		for (int number1 = 1; number1 <= 19; number1++) {
			if (number1 % 3 == 0) {
				for (int number2 = 1; number2 <= 19; number2++) {
					System.out.print(number1 + "*" + number2 + "=" + number1*number2 + "\t");
				}
			System.out.println();
			}
		}
		System.out.println("========================");
		
		//스캐너에서 입력받은 단만 출력 (1~9단)
		System.out.println("출력할 단을 입력하세요 (1~9단)");
		
		Scanner sc = new Scanner(System.in);
		int insert;
		insert = sc.nextInt();
		for (int aaa = 1; aaa <= 9; aaa++) {
			System.out.println(insert + "*" + aaa + "=" + insert*aaa);
		}
		sc.close();
		
	}

}
