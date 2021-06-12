package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
//		// 1. 키보드로 정수(단)을 입력받아서 구구단 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단 입력 : ");
//		int num = 0, mul = 1;
//		num = sc.nextInt(); // 키보드로 정수 입력받는 메소드
//		System.out.println("num = " + num);
//		
//		while (mul <= 9){
//			System.out.println(num + " * " + 
//			mul + " = " + (num * mul));
//			mul++;
//		}
		
		// 2. 키보드로 정수 입력받아서 1~정수까지 합을 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = 0, sum = 0;
//		num = sc.nextInt(); // 키보드로 정수 입력받는 메소드
//		while (num > 0) {
//			sum += num;
//			num--;
//		}
//		System.out.println("sum = " + sum);
		// 답 : 변수 i 1~num까지 i++
		
		// 3. if 와 while을 사용해서 아래처럼 출력할것.
		// 1 : 홀수
		// 2 : 짝수 --- 10 : 짝수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = 0;
		num = sc.nextInt(); // 키보드로 정수 입력받는 메소드
		int i = 1;
		while(num >= i) { // 이거 왜 == 하면 안되는지
			if (i % 2 == 1) {
				System.out.println(i + " : 홀수");
			}
			else {
				System.out.println(i + " : 짝수");
			}
			i++;
		}
		System.out.println("끝");
	}

}
