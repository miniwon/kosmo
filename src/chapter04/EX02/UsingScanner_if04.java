package chapter04.EX02;

import java.util.Scanner;

public class UsingScanner_if04 {

	public static void main(String[] args) {
		//에스프레소, 카페라테, 아포가토 주문할 경우: 3,500원
		//아메리카노를 주문할 경우: 2,000원
		//그 외의 메뉴를 출력할 경우: 우리 매장에 없는 메뉴입니다
		
		//출력: 주문하신 <에스프레소>는 가격이 <3,500>원입니다
		//		우리 매장에 없는 메뉴입니다
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하실 커피 메뉴를 고르세요 >>>");
		
		String a = sc.next();
		int price;
		
		if (a.equals("에스프레소") || a.equals("카페라테") || a.equals("아포가토")) {
			price = 3500;
			System.out.println("주문하신 " + a + "는 가격이 " + price + "원입니다");
		} else if (a.equals("아메리카노")) {
			price = 2000;
			System.out.println("주문하신 " + a + "는 가격이 " + price + "원입니다");
		} else {
			System.out.println("우리 매장에 없는 메뉴입니다");
		}
		
		/*
		 * int price;
		 * system.out.printf("주문하신 %s는 가격이 %d원 입니다", order, price)
		 */
		
		
		/*
		if (a.equals("에스프레소") || a.equals("카페라테")) {
			System.out.println("주문하신 " + a + "는 가격이 " + b + "원입니다");
		} else if (a.equals("아메리카노")) {
			System.out.println("주문하신 " + a + "는 가격이 " + c + "원입니다");
		} else {
			System.out.println("우리 매장에 없는 메뉴입니다");
		}
		*/
		
		/* if (a.equals("에스프레소") || a.equals("카페라테")) {
			System.out.println("주문하신 " + a + "는 가격이 3,500원입니다");
		} else if (a.equals("아메리카노")) {
			System.out.println("주문하신 " + a + "는 가격이 2,000원입니다");
		} else {
			System.out.println("우리 매장에 없는 메뉴입니다");
		}
		*/

	}

}
