package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
//		// 1. Ű����� ����(��)�� �Է¹޾Ƽ� ������ ���
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�� �Է� : ");
//		int num = 0, mul = 1;
//		num = sc.nextInt(); // Ű����� ���� �Է¹޴� �޼ҵ�
//		System.out.println("num = " + num);
//		
//		while (mul <= 9){
//			System.out.println(num + " * " + 
//			mul + " = " + (num * mul));
//			mul++;
//		}
		
		// 2. Ű����� ���� �Է¹޾Ƽ� 1~�������� ���� ���
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int num = 0, sum = 0;
//		num = sc.nextInt(); // Ű����� ���� �Է¹޴� �޼ҵ�
//		while (num > 0) {
//			sum += num;
//			num--;
//		}
//		System.out.println("sum = " + sum);
		// �� : ���� i 1~num���� i++
		
		// 3. if �� while�� ����ؼ� �Ʒ�ó�� ����Ұ�.
		// 1 : Ȧ��
		// 2 : ¦�� --- 10 : ¦��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = 0;
		num = sc.nextInt(); // Ű����� ���� �Է¹޴� �޼ҵ�
		int i = 1;
		while(num >= i) { // �̰� �� == �ϸ� �ȵǴ���
			if (i % 2 == 1) {
				System.out.println(i + " : Ȧ��");
			}
			else {
				System.out.println(i + " : ¦��");
			}
			i++;
		}
		System.out.println("��");
	}

}
