package loop;
public class Ex01 {
	//반복문 : while, do-while, for
	public static void main(String[] args) {
		int num = 0;
		while (num < 5) {
			num++;
			System.out.println("Hello" +num);
//			num++;
		}
		System.out.println("While End : "+num);
		
		
		// 1~10까지의 합을 while로 구하기
		int tot = 0, sum = 0;
		while(sum <= 10) {
			tot += sum;
			sum++;
		}
		System.out.println("total : " + tot);
	}

}
