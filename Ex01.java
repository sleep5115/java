package ex1;

public class Ex01 {

	public static void main(String[] args) {
//		System.out.println(25);
//		// + ��ȣ�� ����ؼ� 25 �پ��ϰ� ����� ��.
//		System.out.println(24+1);
//		System.out.println("2"+"5");
//		System.out.println(2+"5");
//		System.out.println("2"+5);
//		System.out.println("25");
//		System.out.println(""+2+5);
//		
//		System.out.println(8+10+"1"); // ����
//		System.out.println(""+(8+10)); // "8" + 10 == "810"
//		System.out.println(8.15); // �Ǽ�
//		System.out.println(10+3.8); // �Ǽ�
//		System.out.println("10+20="+30); // ���ڿ� + ���� => "10+20=30"
//		System.out.println("10+2.5"+"�� ����� 12.5�Դϴ�."); //
//		System.out.println(10.5+"200"); // "100200"
		
		//����
		//�ڷ���(type) ���� = ��(���)
//		int kor = 100; // 4Byte==32bit
//		
//		kor = 90; // �Ǽ��� ũ��; 8B
//		double kor2=90.5;
//		
//		kor = 10+20;
//		// 30���ϰ�'
//		char ch = 'A';
//		String name="������"; // ���ڿ�
//		
//		System.out.println("����� char = " + ch);
//		System.out.println("����� kor������ " + kor);
//		System.out.println("����� kor2������ " + kor2);
//		System.out.println("����� �̸��� " + name);
//		
//		long number = 2200000000L; // ���L : ���̻�, ������ �⺻Ÿ���� int(48)
//		System.out.println("number = "+ number);
//		System.out.println("Int Min = " + Integer.MIN_VALUE);
//		System.out.println("Long Max = " + Long.MAX_VALUE);
		
		double num1, num2, result; // 4B �Ǽ� ����
		num1 = 1.0000001; // ���� 4B = ��� 8B 
		num2 = 2.0000001;
		result = num1 + num2;
		System.out.println("result = "+result+ " �Դϴ�");
		System.out.println(1.0000001+2.0000001);
	} //main End
} //class End
