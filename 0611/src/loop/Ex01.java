package loop;
public class Ex01 {
	//�ݺ��� : while, do-while, for
	public static void main(String[] args) {
		int num = 0;
		while (num < 5) {
			num++;
			System.out.println("Hello" +num);
//			num++;
		}
		System.out.println("While End : "+num);
		
		
		// 1~10������ ���� while�� ���ϱ�
		int tot = 0, sum = 0;
		while(sum <= 10) {
			tot += sum;
			sum++;
		}
		System.out.println("total : " + tot);
	}

}
