package Test_0711;

import java.util.Scanner;

public class LeapYearTest {
	
	// �����Է� �޼ҵ�
	public static int inputYear() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���⿩�θ� �˰���� ������ �Է����ּ��� >> ");
		return scanner.nextInt();
	}
	
	public static void main(String[] args) {
		
		int Year = inputYear();
		int result;
		
//		����1 : 4�� ���
//		����2 : 100�� ����� �ƴ�
//		����3 : 400�� ����� �� ����
		if ( (Year%4 == 0) && (!(Year%100 == 0) || (Year%400 == 0)) ) {
			result = 1;
			System.out.println(result);
		} else {
			result = 0;
			System.out.println(result);
		}
		
		// �׽�Ʈ�ڵ�
//		int ayaer = year.now();
//		int test = Year.isLeap();
		
	}
}
