package chapter07.EX01;

class A {
	
	int m = 3;
	int n = 4;
	
	//기본 생성자는 생략됨	A () {}
	
	//메소드1
	void work1() {
		int k = 5;		//지역 변수
		System.out.println(k);
		work2 (3);		//work2 (3) 메소드 호출
	}
	
	//메소드2
	void work2 (int i) {
		int j = 4;
		System.out.println(i + j);
	}
	
}


public class Using_Field {
	public static void main(String[] args) {
		
		//객체 생성
		A a = new A ();			//기본 생성자 호출, 생략되어 있다
		
		//필드값 출력
		System.out.println(a.m);
		System.out.println(a.n);

		//메소드 호출
		System.out.println("==메소드 호출==");
		a.work1();		//5 //7
		
	}

}