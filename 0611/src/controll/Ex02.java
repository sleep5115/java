package controll;
public class Ex02 {
	public static void main(String[] args) {
//		String grade = "x";
//		switch case ��
		double avg = 77.7;
		switch ((int)avg/10) {
		case 9 : case 10 :// case ������ :
			System.out.println("A����");
			break; // Ż�⹮
		case 8 :
			System.out.println("B����");
			break;
		case 7 :
			System.out.println("C����");
			break;
		default :
			System.out.println("F����");
		}
	}

}
