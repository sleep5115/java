package controll;
// ��� : if�� �迭, while, for
public class Ex01 {

	public static void main(String[] args) {
//		int num = -10;
//		if (num < 0) {
//			System.out.println("����");
//			System.out.println("�Դϴ�.");
//		}
//		
//		if (num > 0 ) System.out.println("���"); // �ܹ�
//		
//		if (����1) {
//			if(����2) {
//				System.out.println(����1 �׸��� ����2);
//			}
//			System.out.println("��(����)");
//		}
		
//		int num = 0;
//		if (num < 0) {
//			System.out.println("����");
//		}
//		else if(num > 0) {
//				System.out.println("���");	
//		}
//		else {
//			System.out.println("����");
//		}
//		System.out.println("���α׷� ����");
		
//		90~100 : A����
//		80~89 : B����
//		70~79 : C����
//		60~69 : D����
//		������ : F����		���
		
		int num = 90;
		// ������ : �⺻ �ڷ��� �̿��� ��
		String grade;
		if (num >= 90) {
			grade = "A����";
		}
		else if (num >= 80) {
			grade = "B����";
		}
		else if (num >= 70) {
			grade = "C����";
		}
		else if (num >= 60) {
			grade = "D����";
		}
		else grade = "F����";
		System.out.println("����� ������ : " +grade);
	}

}
