package chapter03.EX02;

public class BitwiseOperator {

	public static void main(String[] args) {
		//bit 연산
		//자바 메서드를 사용해서 진법 변환(2진수, 8진수, 16진수)
		int data = 13;
		
		//Integer 객체의 함수를 사용 (총 32bit, 4byte, int)
		//	- toBinaryString(입력값): 10진수 => 2진수
		System.out.println(Integer.toBinaryString(data));	//정수를 2진수로 출력
		System.out.println(Integer.toOctalString(data)); 	//정수를 8진수로 출력
		System.out.println(Integer.toHexString(data));  	//정수를 16진수로 출력
		System.out.println("========================");
		
		//2진수, 8진수, 16진수 값을 10진수로 변환
		System.out.println(Integer.parseInt("1101",2));		//2진수를 10진수로 변환
		System.out.println(Integer.parseInt("15",8));		//8진수를 10진수로 변환
		System.out.println(Integer.parseInt("d",16));		//16진수를 10진수로 변환
		System.out.println("========================");		
		
		//다양한 진법 표현
		System.out.println(13);
		System.out.println(0b1101);			//0b: 2진수
		System.out.println(015);			//0: 8진수
		System.out.println(0xd);			//0x: 16진수
		System.out.println("========================");		
		
		//비트연산자 And: &			<두 비트 모두 1일 때 1
		System.out.println(3 & 10); 			//2
		System.out.println(0b0011 & 0b1010);	//2
		System.out.println(0x03 & 0x0A); 		//2
		System.out.println("========================");		
		
		//비트연산자 Or: |			<한 비트라도 1일 때 1
		System.out.println(3 | 10);
		System.out.println(0b0011 | 0b1010);
		System.out.println(0x03 | 0x0A);
		System.out.println("========================");		
		
		//비트연산자 XOR: ^		<두 비트가 동일하면 0, 두 비트가 다르면 1
		System.out.println(3 ^ 10);
		System.out.println(0b0011 ^ 0b1010);
		System.out.println(0x03 ^ 0x0A);
		System.out.println("========================");		
		
		//비트연산자 NOT: ~		<0일 때 1, 1일 때 0
		System.out.println(~3);
		System.out.println(~0b0011);
		System.out.println(~0x03);
		
		System.out.println(~100);
		System.out.println("========================");	
		
		System.out.println(192 & 255);
		System.out.println(168 & 255);
		System.out.println(100 & 255);
		System.out.println(100 & 0);
		
		int abc = 123;		//10진수
		int bcd = 0123;		//8진수
		int efg = 0x123;	//16진수
		
		System.out.println(abc);
		System.out.println(bcd);
		System.out.println(efg);
		
		
		
	
	}

}
