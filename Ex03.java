package ex1;

public class Ex03 {

	public static void main(String[] args) {
		//접미문자,형변환
		int a = 1000000; // 1백만
		int b = 2000000; // 2백만
		// 위 자료형 변경 금지
		
		long c = (long)a * b; // 2조
		System.out.println("c = "+ c); // 2조
		
		long d = 1000000L * 2000000; // 2조
		System.out.println("d = " + d); //2조
		//int e 타입은 그대로
		int e = 1000000 * (1000000 / 1000000);
		System.out.println("e = " + e);
	}

}
