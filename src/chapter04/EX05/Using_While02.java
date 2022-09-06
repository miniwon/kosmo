package chapter04.EX05;

import java.util.Scanner;

public class Using_While02 {

	public static void main(String[] args) {
		//"그만" 할 때까지 정수값을 넣어서 합계와 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;			//합계
		int count = 0; 			//평균 낼 때 나누는 수
		
		System.out.println("원하는 정수값을 입력하고 마지막으로 그만을 입력하세요");
		String a = sc.next(); 	//문자열 형태로 받은 숫자
		int b = 0; 				//문자열 형태로 받은 숫자를 정수형으로 변환한 변수
		
		while (true) {
			if (a.equals("그만")) {
				break;}
			b = Integer.parseInt(a);
			sum += b;
			count++;
			a = sc.next();
		}
			if( count == 0) {
				System.out.println("입력된 정수가 없습니다");
			} else {
				System.out.println("입력된 정수: " + count + "개입니다");
				System.out.println("입력된 정수의 합: " + sum + "입니다");
				System.out.println("평균은: " + sum/(double)count);
			}
	}
}
