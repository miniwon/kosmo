package chapter04.EX02;

import java.util.Scanner;

public class UsingScanner_if05 {

	public static void main(String[] args) {
		/*
		 * Scanner로 나이를 인풋 받아서 출력
		 * 나이(age)가 8세 미만: "취학 전 아동입니다"
		 * 					 "입장료는 <1000>원입니다"
		 * 나이(age)가 14세 미만: "초등학생입니다"
		 * 					 "입장료는 <2000>원입니다"
		 * 나이(age)가 20세 미만: "중고등학생입니다"
		 * 					 "입장료는 <2500>원입니다"
		 * 나이(age)가 20세 이상: "성인입니다"
		 * 					 "입장료는 <3000>원입니다"
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 >>>");
		
		int age = sc.nextInt();
		int price;
		
		if (age < 8) {
			price = 1000;
			System.out.printf("취학 전 아동입니다 \n입장료는 <%d>원입니다", price);		
		} else if (age < 14) {
			price = 2000;
			System.out.printf("초등학생입니다 \n입장료는 <%d>원입니다", price);
		} else if (age < 20) {
			price = 2500;
			System.out.printf("중고등학생입니다 \n입장료는 <%d>원입니다", price);
		} else {
			price = 3000;
			System.out.printf("성인입니다 \n입장료는 <%d>원입니다", price);
		}
		
		
	}

}
