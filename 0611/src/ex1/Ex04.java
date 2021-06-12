package ex1;

public class Ex04 {

//	public static void main(String[] args) {
//		
////		System.out.println("즐거운 금요일");
//		
//		int num1=10, num2=3;
//		System.out.println("덧셈 결과 = "+(num1+num2));
//		System.out.println("뺄셈 결과 = "+(num1-num2));
//		System.out.println("곱셈 결과 = "+(num1*num2));
//		System.out.println("나눗셈 결과 = "+(num1/num2));
//		System.out.println("나머지 결과 = "+(num1%num2));
//
//	}
	public static void main(String[] args) {
		
//		System.out.println("즐거운 금요일");
		
		int kor, eng, tot = 0;
		
		System.out.println("국어 점수 입력 : ");
		kor = 70; // 키보드로 입력 받을 예정
//		tot = tot + kor;
		tot += kor;
		System.out.println("영어 점수 입력 : ");
		eng = 71;
//		tot = tot + eng;
		tot += eng;
		
		System.out.println("총점 결과 = "+tot);
		System.out.println("평균 결과 = "+(tot/2.0));
//		System.out.println("덧셈 결과 = "+(num1+num2));		
//		System.out.println("뺄셈 결과 = "+(num1-num2));
//		System.out.println("곱셈 결과 = "+(num1*num2));
//		System.out.println("나눗셈 결과 = "+(num1/num2));
//		System.out.println("나머지 결과 = "+(num1%num2));
		
		
//		int money = 1200;
//		System.out.println("1000원짜리 상품구입 : " + money / 1000 + "개");
//		System.out.println("거스름돈 : " + money % 1000 + "원");
		
		int money = 12340;
		// 출력예
		// 만원권 : 1장
		// 오천원권 : 0장
		// 천원권 : 2장
		// 오백원권 : 0개
		// 백원권 : 3개
		// 십원권 : 4개
		
		System.out.println("만원권 : " + money/10000 + "장");
		money %= 10000;
		System.out.println("오천원권 : " + money/5000 + "장");
		money %= 5000;
		System.out.println("천원권 : " + money/1000 + "장");
		money %= 1000;
		System.out.println("오백원권 : " + money/500 + "장");
		money %= 500;
		System.out.println("백원권 : " + money/100 + "장");
		money %= 100;
		System.out.println("십원권 : " + money/10 + "장");
		money %= 10;
		
		
	}

}
