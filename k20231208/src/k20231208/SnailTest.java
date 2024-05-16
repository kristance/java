package k20231208;

import java.util.Scanner;

public class SnailTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int row = 0;
		while (true) {
			System.out.print("행렬의 차수를 3이상의 홀수로 입력하세요: ");
			row = scanner.nextInt();
			if (row >= 3 && row % 2 == 1) {
				break;
			}
			System.out.println("3이상인 홀수를 입력하세요.");
		}
		
		int[][] a = new int[row][row];
		int n = 0; // 배열에 채워질 숫자를 1씩 증가시키는 변수
		int s = 1; // 행과 열이 1 또는 -1씩 증가 및 감소 처리에 사용할 변수
		int i = 0; // 행
		int j = -1; // 열
		int k = row; // 반복문의 반복 횟수 제어에 사용하는 변수
		
		while (true) {
			for (int p = 1; p<=k; p++) { // 행 방향 숫자 채우기
				j += s;
				a[i][j] = ++n;
			}
			
			if (--k <= 0) {
				break;
			}
			
			for (int p = 1; p<=k; p++) { // 열 방향 숫자 채우기
				i += s;
				a[i][j] = ++n;
			}
			s *= -1; // 행과 열이 증가 및 감소되는 값 부호 변경
		}
		
		for (i = 0; i<a.length; i++) {
			for (j = 0; j<a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		
	}
	
}




















