package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main(String[] args) {
		/*
		 * 문제1.
		 * 스캐너로 "Gold"를 넣으면 "금메달입니다"를 출력
		 * 스캐너로 "Silver"를 넣으면 "은메달입니다"를 출력
		 * 스캐너로 "Bronze"를 넣으면 "동메달입니다"를 출력
		 * 그 외는 "메달이 없습니다"
		 */

		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B;
		
		switch (A) {
		case "Gold": case "gold":
			B = "금메달"; 
			System.out.println(B + "입니다");
			break;
		case "Silver": case "silver":
			B = "은메달";
			System.out.println(B + "입니다");
			break;
		case "Bronze": case "bronze"
			B = "동메달";
			System.out.println(B + "입니다");
			break;
		default:
			System.out.println("메달이 없습니다");
			break;
		}		
		
	}

}
