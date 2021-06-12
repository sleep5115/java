package controll;
// 제어문 : if문 계열, while, for
public class Ex01 {

	public static void main(String[] args) {
//		int num = -10;
//		if (num < 0) {
//			System.out.println("음수");
//			System.out.println("입니다.");
//		}
//		
//		if (num > 0 ) System.out.println("양수"); // 단문
//		
//		if (조건1) {
//			if(조건2) {
//				System.out.println(조건1 그리고 조건2);
//			}
//			System.out.println("영(제로)");
//		}
		
//		int num = 0;
//		if (num < 0) {
//			System.out.println("음수");
//		}
//		else if(num > 0) {
//				System.out.println("양수");	
//		}
//		else {
//			System.out.println("제로");
//		}
//		System.out.println("프로그램 종료");
		
//		90~100 : A학점
//		80~89 : B학점
//		70~79 : C학점
//		60~69 : D학점
//		나머지 : F학점		출력
		
		int num = 90;
		// 참조형 : 기본 자료형 이외의 것
		String grade;
		if (num >= 90) {
			grade = "A학점";
		}
		else if (num >= 80) {
			grade = "B학점";
		}
		else if (num >= 70) {
			grade = "C학점";
		}
		else if (num >= 60) {
			grade = "D학점";
		}
		else grade = "F학점";
		System.out.println("당신의 학점은 : " +grade);
	}

}
