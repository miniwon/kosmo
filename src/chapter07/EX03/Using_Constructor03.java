package chapter07.EX03;

class BB {
	
	//필드
	int kor;
	int eng;
	int mat;
	String name;
	
	BB () {}		//기본 생성자
	BB (int a, int b, int c, String name) {		//객체 생성시 필드의 값을 초기화
		kor = a;
		eng = b;
		mat = c;
		this.name = name;
	}

	
	//getter, setter를 사용하여 필드의 값을 초기화 <= 필드의 초기값 할당
	//Setter: 필드의 초기값을 할당
	//Getter: 필드의 값을 출력
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void show() {		//메모리의 정보를 출력하는 메서드
		System.out.println(kor + ", " + eng + ", " + mat + ", " + name);
	}
	
	
}

public class Using_Constructor03 {

	public static void main(String[] args) {
		//필드의 값을 할당하는 3가지 방법
		
		BB bb1 = new BB();
		
		//1. 필드의 값을 직접 할당
		bb1.eng = 90;
		bb1.kor = 80;
		bb1.mat = 70;
		bb1.name = "양정원";
		bb1.show();
		
		//2. 생성자를 사용해서 필드의 초기 값을 할당
		BB bb2 = new BB(90, 80, 70, "김선우");
		bb2.show();
		
		//3. Setter를 사용하여 값을 입력
		BB bb3 = new BB();
		bb3.setEng(30);
		bb3.setKor(80);
		bb3.setMat(100);
		bb3.setName("박성훈");
		bb3.show();
		
		
	}

}
