package controll;
public class Ex02 {
	public static void main(String[] args) {
//		String grade = "x";
//		switch case 문
		double avg = 77.7;
		switch ((int)avg/10) {
		case 9 : case 10 :// case 정수만 :
			System.out.println("A학점");
			break; // 탈출문
		case 8 :
			System.out.println("B학점");
			break;
		case 7 :
			System.out.println("C학점");
			break;
		default :
			System.out.println("F학점");
		}
	}

}
