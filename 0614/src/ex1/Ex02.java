package ex1;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//		int i; // scope
//		for (i = 0; i < 5; i++)
//			System.out.println("Hello " + i);
//		System.out.println("End " + i);
		
		// 1���� num���� ��
		int i;
		Scanner key = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = key.nextInt();
		int sum = 0;
		for (i=0; i<num+1; i++)
			sum += i;
		System.out.println("�� : " + sum);
	}
}