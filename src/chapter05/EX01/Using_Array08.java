package chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {

	public static void main(String[] args) {
		/*
		 * 정수 배열 방 10 개를 생성하고 10개의 값은 스캐너로 인풋 받는다 그중 최대값을 뽑아서 출력하는 프로그램을 생성해 보세요 출력: 배열
		 * 방 10 개에서 최대값은: 000
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("10개의 정수를 입력하세요");

		int[] a = new int[10];
		a[0] = sc.nextInt();
		int max = a[0];
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			int b = sc.nextInt();
			a[i] = b;
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println(Arrays.toString(a));
		System.out.println("최대값: " + max + ", 최소값: " + min);

		System.out.println("=====두 번째 방법은 Arrays.sort() 메소드를 사용해서 출력=====");
		Arrays.sort(a); // 배열 방의 값을 정렬한다 0(최소값), 1, 2, 3, 4... arr.length -1 (최대값)
		System.out.println("최대값: " + a[a.length - 1]);
		System.out.println("최소값: " + a[0]);

		System.out.println("=====Stream을 사용하는 경우=====");
		System.out.println("최대값: " + Arrays.stream(a).max().getAsInt());
		System.out.println("최소값: " + Arrays.stream(a).min().getAsInt());
	}

}
