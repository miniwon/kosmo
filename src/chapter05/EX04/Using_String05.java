package chapter05.EX04;

import java.util.Arrays;

public class Using_String05 {

	public static void main(String[] args) {
		//String의 주요한 특징: 다른 클래스에는 없는 특별한 기능
		//	1. 수정이 불가능 => 새로운 값을 Heap 메모리에 생성
		//	2. 리터럴로 변수의 값을 넣을 경우 동일한 문자열은 주소를 공유
		//	3. 객체 자체를 출력할 때 객체의 주소가 출력되는 것이 아니고 객체의 값이 출력
		//				(toString() 메소드가 재정의되어 있다)
		//	4. 다양한 메소드가 정의되어 있다
		
		//1. 문자열의 길이 (length())		: 글자 수 세기
		String str1 = "Hello java!";
		String str2 = "안녕하세요! 반갑습니다.";

		System.out.println(str1.length());	//11자
		System.out.println(str2.length());	//13자 <= 글자 수
		System.out.println("============================");
		
		//2. 문자열 검색(charAt(), indexOf(), lastIndexOf())
		// 2-1. charAt(): 해당 index(방 번호)의 문자를 가져온다
		
		System.out.println(str1.charAt(0));	//H
		System.out.println(str1.charAt(4)); //O
		System.out.println(str1.charAt(6)); //J
		
		System.out.println(str2.charAt(3)); //세
		System.out.println(str2.charAt(5)); //!
		System.out.println("============================");
		
		// 2-2. indexOf(): 해당 글자에 대한 방 번호를 출력, 왼쪽 => 오른쪽
		//		lastIndexOf(): 해당 글자에 대한 방 번호를 출력, 오른쪽 => 왼쪽
		System.out.println(str1.indexOf('a'));		//7 'a'문자를 왼쪽에서부터 찾을 때 먼저 나오는 a의 방 번호 		(정순)
		System.out.println(str1.lastIndexOf('a'));	//9 'a'문자를 오른쪽에서부터 찾을 때 먼저 나오는 a의 방 번호		(역순)
		//'a'문자를 8번 방 이후에서부터 검색
		System.out.println(str1.indexOf('a',8));
		System.out.println(str1.lastIndexOf('a',8));
		//"Java" 문자열의 방 번호를 검색
		System.out.println(str1.indexOf("java"));	//6 문자가 나오기 시작하는 번호
		System.out.println(str1.lastIndexOf("java"));
		
		System.out.println(str2.indexOf("하세요"));	//2 (번호는 0번부터 시작)
		
		//없는 내용을 검색 시: -1
		System.out.println(str1.indexOf("bye"));
		System.out.println(str2.indexOf("반갑습니다"));
		System.out.println(str2.indexOf("고맙습니다"));
		
		//3. 문자열 변환 및 연결(String.valueOf(), concat())
		String str3 = String.valueOf(2.3);			//double  => String
		String str4 = String.valueOf(false);		//boolean => String
		
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 = str3.concat(str4);			//concat(): +와 같다
		System.out.println(str5);
		
		//4. 문자열 ==> byte[] (getBytes() | 문자열 ==> char[] (toCharArray())
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";
		
		byte[] arr1 = str8.getBytes();				//영문인 경우 아스키코드로 배열에 저장
		byte[] arr2 = str9.getBytes();
	
		System.out.println(Arrays.toString(arr1));	//문자의 아스키코드
		System.out.println(Arrays.toString(arr2));	//문자 == > 숫자 코드로 변환
		
		System.out.println("============================");
		
		char[] arr3 = str8.toCharArray();
		char[] arr4 = str9.toCharArray();
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		
		
		
		
	}

}
