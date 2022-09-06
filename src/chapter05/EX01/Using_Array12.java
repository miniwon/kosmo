package chapter05.EX01;

import java.util.Arrays;

public class Using_Array12 {

	public static void main(String[] args) {
		//1~1000까지 배열(arr)에 저장 후
		
		//1. 배열 선언
		int [] arr = new int[1000];
		
		//2. [입력] for문을 사용해서 arr 배열 변수에 값을 할당
		for(int i = 0, j = 1; i < arr.length; i++, j++) {
			arr[i] = j;
		}
		/*
		 * for (int i = 0; i < arr.length; i++) {
		 * 		arr[i] = i + 1;
		 * }
		 */
		
		
		//3. [출력] for문을 사용해서 arr 배열 변수의 값을 출력
		System.out.println("=====For문을 사용하여 출력=====");
		for ( int i = 0; i < arr.length; i++) {
			if (i<999) {
			System.out.print(arr[i] + " ");
			} else {
				System.out.println(arr[i]);
			}
		}
		
		//4. [출력] Enhanced for문을 사용해서 값을 출력		
		System.out.println("=====향상된 For문을 사용하여 출력=====");
		for (int k : arr) {
			System.out.print(k + " ");
			
		}
		System.out.println();
		
		//5. [출력] Arrays.toString(arr) 출력
		System.out.println("=====Arrays.toString() 메소드를 사용하여 출력=====");
		System.out.println(Arrays.toString(arr));

	}

}
