package ex1;

public class Ex05 {

	public static void main(String[] args) {
		int num = 5;
		// num *= 2; // num = num *2;
		num *= 2.2;
		System.out.println("num = " + num);
		
		// 1. 산술연산자
		// 2. 비교(관계) 연산자
		
		
//		System.out.println(10 > 5); // boolean형
//		System.out.println(10 < 5);
//		System.out.println(10 >= 5);
//		System.out.println(10 <= 5);
//		System.out.println(10 == 5);
//		System.out.println(10 != 5);
		
		// 3. 논리 연산자 ㅣ &&(논리곱, and), ||(논리합, or)
		// true : 1 (0이 아닌값), false : 0
		
//		System.out.println(4>2 || true);
//		System.out.println(true || false);
//		System.out.println(false || true);
//		System.out.println(false || false);
		
		int num1 = 10 , num2 = 20;
		
		boolean result1=(num1 == 10 && num2 != 20);
		boolean result2=(num1 == 10 || num2 != 20);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		if(!(num1 == num2)) {
			System.out.println("두 수는 같지 않다.");
		}
		
	}

}
