package ex1;

public class Ex05 {

	public static void main(String[] args) {
		int num = 5;
		// num *= 2; // num = num *2;
		num *= 2.2;
		System.out.println("num = " + num);
		
		// 1. ���������
		// 2. ��(����) ������
		
		
//		System.out.println(10 > 5); // boolean��
//		System.out.println(10 < 5);
//		System.out.println(10 >= 5);
//		System.out.println(10 <= 5);
//		System.out.println(10 == 5);
//		System.out.println(10 != 5);
		
		// 3. �� ������ �� &&(����, and), ||(����, or)
		// true : 1 (0�� �ƴѰ�), false : 0
		
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
			System.out.println("�� ���� ���� �ʴ�.");
		}
		
	}

}
