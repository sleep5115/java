package array;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// �迭 : ���� Ÿ���� �������� ������ ����
		double[] s = new double[5]; // s[0] s[1] --- s[4] �ε���
		// [5]���� 5�� ���� �Ǵ� ���� s�� ��������
		System.out.println("�迭�� ���� = " + s.length);
		Scanner key = new Scanner(System.in);
		// Ű����� 5���� �Ǽ��� �Է��޾Ƽ� �迭�� ������
//		for (int i = 0; i < 5; i++) {
//			System.out.print(i+1+"��° �Է� : ");
//			s[i] = key.nextDouble();
//		}
		// �迭 ����� ������ ���Ͻÿ�.
		double sum = 0;
		for (int i = 0; i < s.length; i++) {
			System.out.print(i+1+"��° �Է� : ");
			s[i] = key.nextDouble();
			sum += s[i];
		}
		for (int i = 0; i < s.length; i++)
			System.out.println("s[" + i + "] = " + s[i]);
		System.out.println(sum);

		// ���
//		for(i=0; i<s.length; i++)
//			System.out.println("s[" + i + "] = " + s[i]);
//		
//		System.out.println("i = " + i);
	}

}
