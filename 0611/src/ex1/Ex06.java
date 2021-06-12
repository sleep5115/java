package ex1;

public class Ex06 {

	public static void main(String[] args) {
		// 증감 연산자
		
		//			전위식		후위식
		// a = 10, 	++a 			a++		a = a+1 , a += 1
		// b = 10, 	--b			b--		b = b-1 , b -= 1
		
//		int a = 10, b;
//		b = ++a*4;
//		
//		b= a++ * 4;
//		
//		System.out.println("a = "+a);
//		System.out.println("b = "+b);
		
//		int num = 10;
//		System.out.println(++num);
//		System.out.println(num);
//		System.out.println(num++);
//		System.out.println(num);
		
		int val1 = 10 , val2;
		val2 = (val1 --) +5; // 가독성 ()
		
		System.out.println("val1 = " + val1 + ", val2 = " + val2);
		
		// 삼항 연산자 ? :
		
	}

}
