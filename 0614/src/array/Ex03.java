package array;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 3��4��
//		int[][] arr = new int[3][4];
//
//		for (int i = 0; i <arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = i + j; // ij�� ǥ���ϴ� ���
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "  ");
//			}
//			System.out.println(); // �ٹٲ�
//		}

		// ���࿹
		/*
		 * 101ȣ �ο��� �Է� : 2 ���� 102ȣ �ο��� �Է� : 3 ���� 201ȣ �ο��� �Է� : 4 ���� 202ȣ �ο��� �Է� : 1 ����
		 * 301ȣ �ο��� �Է� : 5 ���� 302ȣ �ο��� �Է� : 2 ���� 401ȣ �ο��� �Է� : 2 ���� 402ȣ �ο��� �Է� : 4 ����
		 * 1�� �ο��� 5�� �Դϴ�. 2�� �ο��� 5�� �Դϴ�. 3�� �ο��� 7�� �Դϴ�. 4�� �ο��� 6�� �Դϴ�. ��ü ���� �ο��� 23�Դϴ�.
		 */
		Scanner key = new Scanner(System.in);

		int i = 0, j = 0;
		int[][] arr = new int[4][2];
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.print("���� �Է� : ");
				arr[i][j] = key.nextInt();
			}
		}
		int floor = 0, pop = 0, total = 0;
		for (floor = 0; floor < arr.length; floor++) {
			pop = arr[floor][0] + arr[floor][1];
			System.out.println(floor + 1 + "�� �ο��� " + pop + " �� �Դϴ�.");
			total += pop;
		}
		System.out.println("��ü ���� �ο��� " + total + " �� �Դϴ�.");
	}
}
