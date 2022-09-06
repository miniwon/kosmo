package chapter02.EX05;

public class DataType02 {

	public static void main(String[] args) {
		//float과  double의 정밀도
			//float: 소수점 7 자리까지 정밀도가 유지
			//double: 소수점 15 자리까지 정밀도가 유지
		float f1 = 1.0000001F;		//float에 값을 저장할 때 casting 필요
									//(float)변수 or 변수F
		
			//리터럴: 변수에 저장되는 값을 부를 때
		System.out.println(f1);
		
		float f2 = 1.00000001F;
		System.out.println(f2);
		
		System.out.println("=============");
		
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2);
	}

}
