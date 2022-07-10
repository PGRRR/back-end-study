package Test_0711;

import java.util.Scanner;

public class LeapYearTest {
	public static void main(String[] args) { // ���� �޼���
		int year = InputYear();
		int result = resultJudge(year);
		System.out.println(result);
	}
	public static int InputYear() { // �����Է� �� �Է����� �Ǻ� �޼���
		Scanner scanner = new Scanner(System.in);
		int inputYear = scanner.nextInt();
		if (1 <= inputYear && inputYear <= 4000 ) {
			return inputYear;
		}  else {
			System.out.println("1���� ũ�ų� ���� 4000���� �۰ų� ���� �ڿ����� �Է����ּ���.");
			return InputYear(); 
		}
	}
	public static int resultJudge(int year) { // ���⿩�� �Ǻ� �޼���
		if (( year%4 == 0) && (!(year%100 == 0) || (year%400 == 0)) ) {
			return 1; // ����
		} 
		return 0; // ���
	}
}
