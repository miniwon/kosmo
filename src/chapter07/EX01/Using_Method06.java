package chapter07.EX01;

import java.util.Arrays;

public class Using_Method06 {

	static int add (int[] a) {
		//들어온 배열의 모든 값을 더해서 더한 값을 리턴
		int sum = 0;
		for( int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static int div (int[] a) {
		//들어온 배열의 모든 값을 빼서 뺀 값을 리턴
		int min = 7;
		for( int i = 0; i < a.length; i++) {
			if( i == 0 ) { continue;}
			min -= a[i];
		}
		return min;
	}

	static long mul (int[] a) {
		//들어온 배열의 모든 값을 곱해서 곱한 값을 리턴
		long gop = 1;			//곱할 때는 초기값을 1로 설정
		for( int i = 0; i < a.length; i++) {
			gop *= a[i];
		}
		return gop;
	}
	
	static double avg (int[] a) {
		//들어온 배열의 모든 값을 평균 내서 평균값을 리턴
		int sum = 0;
		for( int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / (double)a.length;
	}
	
	public static void main(String[] args) {	
		//1~100 7의 배수만 저장 후 각 메서드 호출
		
		int[] seven = new int [100/7];
		int d = 7;
		
		for ( int i = 0; i < seven.length; i++) {
			seven[i] = d*(i+1);
		}

	System.out.println("=====1부터 100까지 7의 배수로 이루어진 배열=====");
	System.out.println(Arrays.toString(seven));
	
	//메서드 호출: add(seven)
	int sum = add(seven);
	System.out.println("더한 값: " + sum);
	System.out.println("더한 값: " + add(seven));
	
	//메서드 호출: div(seven)
	int div = div(seven);
	System.out.println("뺀 값: " + div);
	System.out.println("뺀 값: " + div(seven));

	//메서드 호출: mul(seven)
	long mul = mul(seven);
	System.out.println("곱한 값: " + mul);
	System.out.println("곱한 값: " + mul(seven));
	
	//메서드 호출: avg(seven)
	double avg = avg(seven);
	System.out.println("평균 값: " + avg);
	System.out.println("평균 값: " + avg(seven));
	
	
	
	/* 강사님 풀이
	 * int[] arr1 = new int[100/7];
	for (int i = 0, j = 7; i < arr1.length; i++, j+=7) {
		arr1[i] = j;
	}
	 */
	
	/* 재동 풀이
	 *int [] b = new int[14];
         
      int count = 0;
      
      for(int i = 1; i <= 100; i++) {
         if(i%7 == 0) {
            b[count] = i;
            System.out.print(b[count] + " ");
            count++;            
         }
      }
	 */
	
		
	}

}
