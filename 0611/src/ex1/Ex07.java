package ex1;

public class Ex07 {

	public static void main(String[] args) {
		int max = 0, num1, num2, num3;
//		num1=10, num2=20; ÀÚ¹Ù´Â ¾ÈµÊ ´Ù¸¥¾î´Â µÊ
		num1 = 100; num2 = 200; num3 = 150;
		
		max = (num1 > num2) ? ((num1 > num3) ? num1 : num3)
				: ((num2 > num3) ? num2 : num3);
		
		if(num1 > num2) {
			max = (num1 > num3) ? num1 : num3;
		}
		if(num2 <= num2) {
			max = (num2 > num3) ? num2 : num3;
		}
		
		System.out.println("result = " + max);
		
		
	}

}
