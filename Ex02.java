package ex1;

public class Ex02 {

	public static void main(String[] args) {
//		int num1;
//		num1=10; //�ʱ�ȭ
//		int num2 = 20; // �ʱ�ȭ
//		int num3 = num1 + num2;
//		System.out.println("num3 = "+num3);

//		char ch = 'B'; // 'A' = 65 'B' = 66
//		System.out.println("ch = " + (char) (ch+1));
		
		int num1 = 100;
		long num2 = 200;
		long result = num1 + num2; // �ڵ�����ȯ long + long ==> long
		System.out.println("long = "+result);
		
		System.out.println("result = "+(3/2));
		System.out.println("result = "+(3.0/2.0));
		System.out.println("result = "+(3/2.0));
		System.out.println("result = "+(3.0/2)); // �ڵ�����ȯ int -> double
		
		//���� ����ȯ : (type) cast������
		int kor = 70;
		int eng = 71;
		int tot = kor + eng;

		int cnt = 2;
		double avg = (double) tot / cnt; // 141.0 / 2.0 ==> 70.5
		
		
		System.out.println("��� = " + avg);
		
		double pi = 3.1415;
		int intPi=(int)pi;
		System.out.println("intPi = " + intPi);
	}

}