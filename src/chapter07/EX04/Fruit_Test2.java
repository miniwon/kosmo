package chapter07.EX04;

class Fruit{
	
	// 1. 필드
	String name;				// 과일 이름
	String color;				// 과일 색상
	int conunt;					// 과일 개수
	int sugarContent;			// 과일 당도
	
	// 2. 생성자
	Fruit(){
		
	}
	Fruit(String name, String color, int conunt,int sugarContent ){
		this.name = name;
		this.color = color;
		this.conunt = conunt;
		this.sugarContent = sugarContent;
	}


	
	// 3. show() : 필드 값 모두 출력
	void show() {
		System.out.println(name + ", " + color + ", " + conunt + ", "+ sugarContent);
	}
	
	// 4. getter / setter 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getConunt() {
		return conunt;
	}

	public void setConunt(int conunt) {
		this.conunt = conunt;
	}

	public int getSugarContent() {
		return sugarContent;
	}

	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}
	
	
}


public class Fruit_Test2 {

	public static void main(String[] args) {
		// 1. banana 객체 생성 후 필드에 기본 값 직접 입력 후 직접 출력
		System.out.println("======1. banana==========");
		Fruit banana = new Fruit();
		
		banana.name = "바나나";
		banana.color= "yellow";
		banana.conunt = 3;
		banana.sugarContent = 10;
		
		
		
		
		System.out.print(banana.name+ ", "); 
		System.out.print(banana.color+ ", ");	
		System.out.print(banana.conunt+ ", ");
		System.out.print(banana.sugarContent);
		
		System.out.println();
		// 2 . apple  : 생성자 사용하여 4개 필드에 초기값 할당.  show() 출력
		System.out.println("======2. apple ==========");
		Fruit apple = new Fruit("apple","red",4,7);
		
		apple.show();
		
		
		// 3 . strawberry : setter 이용하여 4개 필드 값 할당. getter 이용하여 출력
		System.out.println("======3. strawberry ======");
		Fruit s = new Fruit();
		s.setName("strawberry");
		s.setColor("red");
		s.setConunt(7);
		s.setSugarContent(8);
		
		System.out.print(s.getName() + ", ");
		System.out.print(s.getColor() + ", ");
		System.out.print(s.getConunt() + ", ");
		System.out.print(s.getSugarContent());
		
	}

}
