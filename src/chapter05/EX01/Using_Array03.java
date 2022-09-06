package chapter05.EX01;

import java.util.Arrays;

public class Using_Array03 {

	public static void main(String[] args) {
		//한국을 빛낸 5명의 위인들만 s라는 String 배열에 저장 후 4 가지 방법으로 출력
		
		String [] s = new String [5];
		
		s[0] = "이순신";
		s[1] = "강감찬";
		s[2] = "정약용";
		s[3] = "정지원";
		s[4] = "김두례";
		System.out.println(s.length);
		System.out.println("=========================");
		
		//1. 직접 출력
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		System.out.println("=========================");
		
		//2. for문을 사용하여 출력
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println("=========================");
		
		//3. 향상된 for문을 사용
		for (String k : s) {
			System.out.println(k);
		}
		System.out.println("=========================");
		
		//4. Arrays.toString
		System.out.println(Arrays.toString(s));
		
	}

}
