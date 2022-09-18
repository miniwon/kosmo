package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {
		//swich문으로 처리
		/* 
		 * 에스프레소, 카페라테, 아포가토를 주문할 경우 가격이 3,500원
		 * 아메리카노를 주문할 경우 가격은 2,500원
		 * 그 외 메뉴를 출력할 경우에는 "우리 매장에 없는 메뉴입니다"
		 */
		//출력: 주문하신 <에스프레소>는 가격이 <3,500>원입니다
		
		System.out.println("주문하실 메뉴를 입력해 주세요");
		System.out.println("에스프레소, 카페라테, 아포가토, 아메리카노");
		
		Scanner sc = new Scanner(System.in);
		String menu = sc.next();
		int price;
		
		switch (menu) {
		case "에스프레소": case "카페라테": case "아포가토":
			price = 3500;
			System.out.println("주문하신 <" + menu + ">는 가격이 <" + price + ">원입니다");
			break;
		case "아메리카노":
			price = 2500;
			System.out.println("주문하신 <" + menu + ">는 가격이 <" + price + ">원입니다");
			break;
		default:
			System.out.println("우리 매장에 없는 메뉴입니다");
			break;
		}
		sc.close();
	}

}


/*


*/