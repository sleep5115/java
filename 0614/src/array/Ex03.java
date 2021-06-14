package array;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 3행4열
//		int[][] arr = new int[3][4];
//
//		for (int i = 0; i <arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = i + j; // ij로 표현하는 방법
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "  ");
//			}
//			System.out.println(); // 줄바꿈
//		}

		// 실행예
		/*
		 * 101호 인원수 입력 : 2 엔터 102호 인원수 입력 : 3 엔터 201호 인원수 입력 : 4 엔터 202호 인원수 입력 : 1 엔터
		 * 301호 인원수 입력 : 5 엔터 302호 인원수 입력 : 2 엔터 401호 인원수 입력 : 2 엔터 402호 인원수 입력 : 4 엔터
		 * 1층 인원은 5명 입니다. 2층 인원은 5명 입니다. 3층 인원은 7명 입니다. 4층 인원은 6명 입니다. 전체 빌라 인원은 23입니다.
		 */
		Scanner key = new Scanner(System.in);

		int i = 0, j = 0;
		int[][] arr = new int[4][2];
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.print("정수 입력 : ");
				arr[i][j] = key.nextInt();
			}
		}
		int floor = 0, pop = 0, total = 0;
		for (floor = 0; floor < arr.length; floor++) {
			pop = arr[floor][0] + arr[floor][1];
			System.out.println(floor + 1 + "층 인원은 " + pop + " 명 입니다.");
			total += pop;
		}
		System.out.println("전체 빌라 인원은 " + total + " 명 입니다.");
	}
}
