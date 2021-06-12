package ex1;

public class Ex01 {

	public static void main(String[] args) {
//		System.out.println(25);
//		// + 기호를 사용해서 25 다양하게 출려갈 것.
//		System.out.println(24+1);
//		System.out.println("2"+"5");
//		System.out.println(2+"5");
//		System.out.println("2"+5);
//		System.out.println("25");
//		System.out.println(""+2+5);
//		
//		System.out.println(8+10+"1"); // 정수
//		System.out.println(""+(8+10)); // "8" + 10 == "810"
//		System.out.println(8.15); // 실수
//		System.out.println(10+3.8); // 실수
//		System.out.println("10+20="+30); // 문자열 + 정수 => "10+20=30"
//		System.out.println("10+2.5"+"의 결과는 12.5입니다."); //
//		System.out.println(10.5+"200"); // "100200"
		
		//변수
		//자료형(type) 변수 = 값(상수)
//		int kor = 100; // 4Byte==32bit
//		
//		kor = 90; // 실수의 크기; 8B
//		double kor2=90.5;
//		
//		kor = 10+20;
//		// 30리턴값'
//		char ch = 'A';
//		String name="차지헌"; // 문자열
//		
//		System.out.println("당신의 char = " + ch);
//		System.out.println("당신의 kor점수는 " + kor);
//		System.out.println("당신의 kor2점수는 " + kor2);
//		System.out.println("당신의 이름은 " + name);
//		
//		long number = 2200000000L; // 상수L : 접미사, 정수의 기본타입은 int(48)
//		System.out.println("number = "+ number);
//		System.out.println("Int Min = " + Integer.MIN_VALUE);
//		System.out.println("Long Max = " + Long.MAX_VALUE);
		
		double num1, num2, result; // 4B 실수 변수
		num1 = 1.0000001; // 변수 4B = 상수 8B 
		num2 = 2.0000001;
		result = num1 + num2;
		System.out.println("result = "+result+ " 입니다");
		System.out.println(1.0000001+2.0000001);
	} //main End
} //class End
