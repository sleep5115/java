package array;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = { 8, 5, 6, 2, 4 }; // �迭 �ʱ�ȭ
		// �迭�� ��Ұ��� �ִ밪, �ּҰ� ���
		int max, min;
		max = min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
			if(min > arr[i])
				min=arr[i];
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);

	} // main end
} // class end
