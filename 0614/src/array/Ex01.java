package array;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 배열 : 같은 타입의 연속적인 변수의 집합
		double[] s = new double[5]; // s[0] s[1] --- s[4] 인덱스
		// [5]에서 5는 개수 또는 길이 s는 참조변수
		System.out.println("배열의 길이 = " + s.length);
		Scanner key = new Scanner(System.in);
		// 키보드로 5개의 실수를 입려받아서 배열에 저장후
//		for (int i = 0; i < 5; i++) {
//			System.out.print(i+1+"번째 입력 : ");
//			s[i] = key.nextDouble();
//		}
		// 배열 요소의 총합을 구하시오.
		double sum = 0;
		for (int i = 0; i < s.length; i++) {
			System.out.print(i+1+"번째 입력 : ");
			s[i] = key.nextDouble();
			sum += s[i];
		}
		for (int i = 0; i < s.length; i++)
			System.out.println("s[" + i + "] = " + s[i]);
		System.out.println(sum);

		// 출력
//		for(i=0; i<s.length; i++)
//			System.out.println("s[" + i + "] = " + s[i]);
//		
//		System.out.println("i = " + i);
	}

}
