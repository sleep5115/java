package ex1;

public class Ex04 {

//	public static void main(String[] args) {
//		
////		System.out.println("��ſ� �ݿ���");
//		
//		int num1=10, num2=3;
//		System.out.println("���� ��� = "+(num1+num2));
//		System.out.println("���� ��� = "+(num1-num2));
//		System.out.println("���� ��� = "+(num1*num2));
//		System.out.println("������ ��� = "+(num1/num2));
//		System.out.println("������ ��� = "+(num1%num2));
//
//	}
	public static void main(String[] args) {
		
//		System.out.println("��ſ� �ݿ���");
		
		int kor, eng, tot = 0;
		
		System.out.println("���� ���� �Է� : ");
		kor = 70; // Ű����� �Է� ���� ����
//		tot = tot + kor;
		tot += kor;
		System.out.println("���� ���� �Է� : ");
		eng = 71;
//		tot = tot + eng;
		tot += eng;
		
		System.out.println("���� ��� = "+tot);
		System.out.println("��� ��� = "+(tot/2.0));
//		System.out.println("���� ��� = "+(num1+num2));		
//		System.out.println("���� ��� = "+(num1-num2));
//		System.out.println("���� ��� = "+(num1*num2));
//		System.out.println("������ ��� = "+(num1/num2));
//		System.out.println("������ ��� = "+(num1%num2));
		
		
//		int money = 1200;
//		System.out.println("1000��¥�� ��ǰ���� : " + money / 1000 + "��");
//		System.out.println("�Ž����� : " + money % 1000 + "��");
		
		int money = 12340;
		// ��¿�
		// ������ : 1��
		// ��õ���� : 0��
		// õ���� : 2��
		// ������� : 0��
		// ����� : 3��
		// �ʿ��� : 4��
		
		System.out.println("������ : " + money/10000 + "��");
		money %= 10000;
		System.out.println("��õ���� : " + money/5000 + "��");
		money %= 5000;
		System.out.println("õ���� : " + money/1000 + "��");
		money %= 1000;
		System.out.println("������� : " + money/500 + "��");
		money %= 500;
		System.out.println("����� : " + money/100 + "��");
		money %= 100;
		System.out.println("�ʿ��� : " + money/10 + "��");
		money %= 10;
		
		
	}

}
