package k20231208;

import java.util.Arrays;

public class ZigzagTest {

	public static void main(String[] args) {
		
//		2차원 배열
//		자료형[][] 배열이름 = new 자료형[행][열];
		int[][] a = new int[4][6];
		/*
		System.out.println("행의 개수: " + a.length);
		System.out.println("열의 개수: " + a[0].length);
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(a[0]));
		for (int i = 0; i<a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		
		int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		for (int i = 0; i<b.length; i++) {
			System.out.println(Arrays.toString(b[i]));
		}
		*/
		
		int n = 0; // 배열에 채워질 숫자를 1씩 증가시키는 변수
		for (int i = 0; i<a.length; i++) { // 행
//			짝수 행과 홀수 행이 숫자가 채워지는 방향이 다르므로 반복문을 별도로 만든다.
			if (i % 2 == 0) { // 짝수 행인가?
//				짝수행, j => 0, 1, 2, 3, 4, 5
				for (int j = 0; j<a[i].length; j++) {
					a[i][j] = ++n;
				}
			} else {
//				홀수행, j => 5, 4, 3, 2, 1, 0
				for (int j = 5; j>=0; j--) {
					a[i][j] = ++n;
				}
			}
		}
		
		for (int i = 0; i<a.length; i++) {
			for (int j = 0; j<a[i].length; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}
		
	}
	
}

















