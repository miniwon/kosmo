package chapter05.EX02;

import java.util.Arrays;

public class Using_Array_2D_02_01 {

	public static void main(String[] args) {
		String[][] arr1 = new String[][] {{"홍길동","이순신","세종대왕"},{"독수리","부엉이","닭","오리"},{"붕어","가물치","잉어"},{"호랑이","사자"}};
		String[] arr2 = new String[] {"사람","새","물고기","포유류"};
		
		//출력:	사람 이름		: 홍길동 이순신 세종대왕
				//		새 이름		: 독수리 부엉이 닭 오리
				//		물고기 이름	: 붕어 가물치 잉어
				//		포유류 이름	: 호랑이 사자
				
		//1. for문을 이용하여 출력
		System.out.println("=====전공자의 풀이=====");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " 이름: ");
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		//2. Enhanced for문을 이용하여 출력
		System.out.println("=====향상된 for문 이용=====");
		int e = 0;
		for (String[] a : arr1) {
			System.out.print(arr2[e] + " 이름: ");
			for (String b : a) {
				System.out.print(b + " ");
			}
			e++;
			System.out.println();
		}
		//b == "홍길동" 가능은 하나 연산자 말고 b.equals 사용하기
		
		//3. Arrays.toString() 이용하여 출력
		System.out.println("=====Arrays.toString() 이용=====");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " 이름: ");
			System.out.println(Arrays.toString(arr1[i]));
		}


	}

}
