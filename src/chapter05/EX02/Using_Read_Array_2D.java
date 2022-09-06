package chapter05.EX02;

public class Using_Read_Array_2D {

	public static void main(String[] args) {
		//2차원 배열의 값을 읽기
			//1차원 배열일 때: arr.length		<= 열의 개수
			//2차원 배열일 때: arr.length		<= 행의 개수
			//			  : arr[i].length	<= 열의 개수, i: 행의번호
		
		int[] arr0 = new int[100];
		System.out.println(arr0.length);
		
		//1. 2차원 배열의 길이(정방형 배열)
		int[][] arr1 = new int[2][3];
		System.out.println(arr1.length);	//2: 행의 개수
		System.out.println(arr1[0].length); //3: 0행의 열의 개수
		System.out.println(arr1[1].length); //3: 1행의 열의 개수
		System.out.println("========================================");
		
		//2. 2차원 배열의 길이(비정방형 배열)
		int[][] arr2 = new int[][] {{1,2},{3,4,5}};
		System.out.println(arr2.length); 		//2: 행의 개수
		System.out.println(arr2[0].length); 	//2: 0행의 열의 개수
		System.out.println(arr2[1].length); 	//3: 1행의 열의 개수
		

		
		//2차원 배열 출력 방법
		//1. 방 번호를 직접 입력
		System.out.print(arr2[0][0] + " " + arr2[0][1]);
		System.out.println();
		System.out.print(arr2[1][0] + " " + arr2[1][1] + " " + arr2[1][2]);
		System.out.println();
		
		//2. for문을 사용하여 출력: 2차원 배열 이중 for문 (for문 내의 for문)
			//바깥쪽 for문		: arr.length: 행의 개수
			//안쪽 for문		: arr[i].length: i행의 열의 개수
		System.out.println("=====이중 for문을 사용해서 이차원 배열 값 출력=====");
		for (int i = 0; i < arr2.length; i++) {		//행의 개수를 1씩 증가
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");	//i: 행의 방 번호, j: 열의 방 번호
			}
			System.out.println(); 					//한 행이 끝나면 enter 적용
		}
		
		//3. Enhanced for문을 사용하여 출력		:이중 for문을 사용해서 출력
			//바깥쪽 for문은: 
		System.out.println("=====Enhanced for문으로 출력=====");
		for (int[] a : arr2 ) { 		//arr2 이차원배열을 1차원 배열로 꺼낸다
			for (int b : a) {			//a 일차원 배열의 각 방의 값을 b 변수로 꺼낸다
				System.out.print(b + " ");
			}
		System.out.println();
		}
		
		

	}

}
