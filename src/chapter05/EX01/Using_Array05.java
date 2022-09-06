package chapter05.EX01;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
		// 1~500까지 3의 배수를 배열에 저장
		// 출력 1. 직접 출력, 2. for문 이용 출력, 3. 향상된 for문 이용 출력, 4. toString 이용 출력
		// 합계: 평균:
		// 방의 개수: 166개

		int[] a = new int[166];
		int b = 0;
		int sum = 0;

		// 1. 배열에 3의 배수 저장
		for (int i = 0, j = 3; i < a.length; i++, j += 3) {
			if (j <= 500) {
				a[i] = j;
				b++;
				sum += j;
			}
		}

		// 2-1. 직접 출력
		System.out.println(a[65]);
		System.out.println();

		// 2-2. for문 이용 출력
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		// 2-3. 향상된 for문 이용 출력
		for (int k : a) {
			System.out.print(k + " ");
		}
		System.out.println();

		// 2-4. toString 이용 출력
		System.out.println(Arrays.toString(a));

		System.out.println("합계: " + sum + ", 평균: " + sum / (double) b);

	}
}
