package chapter04.EX06;

import java.util.Scanner;

public class Using_DoWhile03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int nu = 0;  		//스캐너에서 정수를 인풋
		
		do {
			System.out.println("==================================");
			System.out.println("1. 19단 출력 | 2. 홀수단 출력 | 3. 3의 배수단 출력 | 4. 종료");
			System.out.println("==================================");
			System.out.println("원하는 숫자를 선택하세요 >>>");
			nu = sc.nextInt();
			if (nu == 1) {
				//1. 19단 출력
				System.out.println("==1. 19단 출력==");
				for (int nu1 = 1; nu1 <= 19; nu1++) {
					for (int nu2 = 1; nu2 <= 19; nu2++) {
						System.out.print(nu1 + "*" + nu2 + "=" + nu1*nu2 + "\t");
					}
					System.out.println();
				}
			} else if (nu == 2) {
				//2. 홀수단 출력
				System.out.println("==2. 홀수단 출력==");
				for (int nu3 = 1; nu3 <= 19; nu3 +=2) {
					for (int nu4 = 1; nu4 <= 19; nu4++) {
						System.out.print(nu3 + "*"+ nu4 + "=" + nu3*nu4 + "\t");
					}
					System.out.println();
				}
			} else if (nu == 3) {
				//3. 3의 배수단 출력
				System.out.println("==3. 3의 배수단 출력==");
				for (int nu5 = 1; nu5 <= 19; nu5++) {
					if (nu5 % 3 == 0) {
						for (int nu6 = 1; nu6 <= 19; nu6++) {
							System.out.print(nu5 + "*" + nu6 + "=" + nu5*nu6 + "\t");
						}
						System.out.println();
					}
				}
			} else if (nu == 4) {
				break;
			}
		} while (run); 	//무한 루프
		System.out.println("프로그램 종료");
	}

}
