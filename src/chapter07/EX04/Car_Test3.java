package chapter07.EX04;

class Car{
	// 1. 필드
	String Company;				// 제조회사
	String model;				// 자동차 모델
	String color;				// 자동차 색깔
	double maxSpeed;			// 자동차 최대 출력
	
	
	// 2. 생성자
	Car(){}
	
	Car(String Company, String model, String color, double maxSpeed ){
		this.Company = Company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
		
	}
	
	
	
	// 3.  show()
	void show() {
		System.out.println(Company + ", " + model + ", "+ color + ", "+ maxSpeed);
	}




	
	 
	// 4. G/S
	
	public String getCompany() {
		return Company;
	}


	public void setCompany(String company) {
		Company = company;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}




public class Car_Test3 {
	
	public static void main(String[] args) {
		// 객체 생성
		// car1 : 현대자동차 그랜져 <- 필드 값 직접 출력
		// car2 : 쌍용자동차 체어맨 <- show() 통해 출력
		// car3 : 기아자동차 k9 <- setter 통해 출력
		System.out.println("====car1 ===========");
		Car car1 = new Car();
		car1.Company = "현대자동차";
		car1.model = "그랜져";
		car1.color = "black";
		car1.maxSpeed = 200;
		System.out.print(car1.Company + ", ");
		System.out.print(car1.model + ", ");
		System.out.print(car1.color + ", ");
		System.out.print(car1.maxSpeed + ", ");
		
		System.out.println();
		System.out.println("====car2 ===========");
		Car car2 = new Car("쌍용자동차","체어맨","black",210);
		car2.show();
	
		
		System.out.println("====car3 ===========");
		
		Car car3 = new Car();
		car3.setCompany("기아자동차");
		car3.setModel("K9");
		car3.setColor("black");
		car3.setMaxSpeed(205);
		
		System.out.print(car3.getCompany()+ ", ");
		System.out.print(car3.getModel()+ ", ");
		System.out.print(car3.getColor()+ ", ");
		System.out.print(car3.getMaxSpeed());
		
	}

}
