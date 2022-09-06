package chapter04.EX04;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {
		//for문 내의 if
		//정수(음수, 양수)를 스캐너로 5개 인풋 받아서
		//양수만 더한 값을 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		int a; 			//입력하는 값
		int i; 			//횟수
		int sum = 0; 	//모든 수를 더한 값
		int sum1 = 0; 	//양수만 더한 값
		int count = 0; 	//모든 수를 카운트
		int count1 = 0;	//양수만 카운트
		System.out.println("정수 5개를 입력하세요(음수, 양수) >>");
		for ( i = 0; i < 5; i++ ) {
			a = sc.nextInt();
			sum += a;
			count++;
			if (a > 0) {
				sum1 += a;
				count1 += 1; //count++도 가능, 양수일 때 1씩 증가
			} 
		}
		System.out.println("모든 수의 합: " + sum);
		System.out.println("모든 수의 평균값: " + sum/(double)count);
		System.out.println("양수만 더한 값: " + sum1);
		System.out.println("양수의 평균값: " + sum1/(double)count1);
		sc.close();
		
	}

}
