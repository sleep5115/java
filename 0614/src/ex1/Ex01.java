package ex1;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 실행예
		// 정수 입력 : 10 엔터
		// 정수 입력 : 20 엔터
		// 정수 입력 : 5 엔터
		// 정수 입력 : 0 엔터
		// 총 합계는 35 입니다.

//		int total = 0, val = 0;
//		Scanner key = new Scanner(System.in);
//		
//		// (1) do while
//		do {
//			System.out.println("숫자 입력 (0 to quit) :");
//			val = key.nextInt();
//			total += val;
//		} while (val != 0);
//		System.out.println("합계 = " + total);
//		
//		// (2) while
//		while (true) {
//			System.out.println("숫자 입력 (0 to quit) :");
//			val = key.nextInt();
//			if(val==0)
//				break;
//			total += val;
//		}
//		System.out.println("합계 = " + total);

//		int num = 1;
//		boolean search = false;
//		while (true) {
//			if (num % 5 == 0 && num % 7 == 0)
//			{
//				search = true;
//				break;
//			}
//			num++;
//		}
//		if (search)
//			System.out.println("찾는 정수 : " + num);
//		else
//			System.out.println("5의 배수이자 7의 배수를 찾지 못했습니다.");

		// 2~9단 출력
//		int i = 2;
//		while (i <= 9) {
//			int j = 1;
//			while (j <= 9) {
//				System.out.println(i + " * " + j + " = " + i * j);
//				j++;
//			}
//			i++;
//		}
		
//		while(조건) {
//			if(계속 조건)
//				continue;
//			.args.clone();
//			.args.clone();
//		}
		
		// continue를 이용해서 짝수 단만 출력
//		int i, j;
//		for (i = 1; i <= 9; i++) {
//			if(i%2!=0)
//				continue;
//			for (j = 1; j <= 9; j++) {
////				if(i<j) break;
//				System.out.println(i + " * " + j + " = " + i * j);
////				if (i == j)
////					break; // break는 자신을 포함하는 반복문을 탈출
//			}
//			System.out.println("-----------");
//		for (int i = 0; i <= 10; i++) {
//			if (i % 2 == 0 || i % 3 == 0)
//				continue;
//			System.out.println(i);
		
	} // main End
} // class End
