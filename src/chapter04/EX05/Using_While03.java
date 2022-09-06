package chapter04.EX05;

import java.util.Scanner;

public class Using_While03 {

	public static void main(String[] args) {
		/*"그만" 할 때까지 정수값을 넣어서 합계와 평균을 출력
		 * 힌트: 문자열을 정수로 변환
		 * 1. String s = sc.nextLine();
		 * 2. s.split(" ");
		 * 3. 문자형 String을 정수형으로 변환, Integer.ParseInt()
		 * 4. 합계와 평균을 구하면 됩니다
		 */

		Scanner sc = new Scanner(System.in);
		String s;
		int sum = 0;
		int count = 0;
		int b;

		do {
		System.out.println("원하는 만큼 공백을 이용해서 정수를 입력하세요 >>>");
		System.out.println("예) 10 40 50 70");
		s = sc.nextLine();
		String [] arr;
		arr = s.split(" ");
		if (s.equals("그만")) { break;}
		
		for (int i = 0; i < arr.length; i++) {
			b = Integer.parseInt(arr[i]);
			sum += b;
			count++;
			} 
		System.out.println("정수의 개수: " + count);
		System.out.println("정수의 합계: " + sum);
		System.out.println("정수의 평균: " + sum / (double)count );
		} while (true); 
		System.out.println("프로그램을 종료합니다");
		
	}

}
