package chapter10.EX05;

class Animal {
	void cry() {
		System.out.println("모든 동물은 웁니다");
	}
}
class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}
class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("왈왈 크르릉 컹컹");
	}
}

public class Using_Method_Overriding02 {

	public static void main(String[] args) {
		// 1. 각각의 타입으로 선언 + 각각의 클래스로 객체 생성
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		
		System.out.println("==========");
		
		// 2. Animal 타입으로 선언 + 자식 클래스로 객체 생성
		//		자식의 객체를 생성할 때 부모 타입으로 정의 후 부모의 메서드를 호출 -> 오버라이딩된 메서드 출력
		Animal aa1 = new Animal();
		Animal bb1 = new Bird();
		Animal cc1 = new Cat();
		Animal dd1 = new Dog();
		
		aa1.cry();		// Animal의 cry()를 호출
		bb1.cry();		// Animal의 cry()를 호출 -> 오버라이딩된 메서드가 출력
		cc1.cry();		// Animal의 cry()를 호출 -> 오버라이딩된 메서드가 출력
		dd1.cry();		// Animal의 cry()를 호출 -> 오버라이딩된 메서드가 출력
		
		// Animal 타입으로 선언되어 있으므로 배열이나 콜렉션에 넣어서 아주 쉽게 관리
		// 배열의 특징: 1. 동일한 타입을 저장, 2. 방의 크기가 선언되면 바꿀 수 없다
		int[] arr1 = new int[5];			// 배열의 방 크기 지정 후 값을 할당
		int[] arr2 = new int[] {1,2,3,4};	// 배열의 선언과 동시에 값을 할당
		// 타입[] 배열 변수 ==
		
		// 객체를 배열에 저장
		System.out.println("=====객체를 배열에 저장 후 출력=====");
		Animal[] arr3 = new Animal[] {aa1, bb1, cc1, dd1};
		
		// for문을 사용해서 출력
		System.out.println("=====for문 사용 출력=====");
		for (int i = 0; i < arr3.length; i++) {
			arr3[i].cry();				// 각 방마다 객체가 들어 있다
		}
		
		// Enhanced for문을 사용해서 출력
		System.out.println("=====Enhanced for문 사용 출력=====");
		for (Animal animal: arr3) {
			animal.cry();
		}
		
	}

}
