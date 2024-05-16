package k20231211;

import java.util.Scanner;

public class SnailTest2 {

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
		int n = 1;
		int s = 1;
//		정 가운데 부터 숫자를 채워야 하므로 행과 열의 위치를 row / 2로 초기화 한다.
		int i = row / 2;
		int j = row / 2;
//		k를 0으로 초기화하면 3시 방향부터, -1로 초기화하면 3시 방향부터 숫자를 채워나간다.
		int k = -1;

		a[i][j] = n;
//		boolean flag = false;
		
		EXIT: // while (true) 반복에 레이블을 지정한다.
		while (true) {
			k++;
			for (int p = 1; p<=k; p++) {
				if (++n > Math.pow(row, 2)) {
//					flag = true;
//					break는 자기가 포함된 {} 블록을 탈출한다.
//					break; // for (int p = 1; p<=k; p++) 반복을 탈출한다.
//					break 뒤에 레이블을 적어주면 레이블이 지정된 반복을 탈출한다.
					break EXIT;
				}
				j += s;
				a[i][j] = n;
			}
			
//			if (flag) {
//				break;
//			}
			
			for (int p = 1; p<=k; p++) {
				i += s;
				a[i][j] = ++n;
			}
			s *= -1;
		}
		
		for (i = 0; i<a.length; i++) {
			for (j = 0; j<a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		
	}
	
}











