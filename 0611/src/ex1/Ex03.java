package ex1;

public class Ex03 {

	public static void main(String[] args) {
		//���̹���,����ȯ
		int a = 1000000; // 1�鸸
		int b = 2000000; // 2�鸸
		// �� �ڷ��� ���� ����
		
		long c = (long)a * b; // 2��
		System.out.println("c = "+ c); // 2��
		
		long d = 1000000L * 2000000; // 2��
		System.out.println("d = " + d); //2��
		//int e Ÿ���� �״��
		int e = 1000000 * (1000000 / 1000000);
		System.out.println("e = " + e);
	}

}
