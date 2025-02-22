package k20231208;

public class ZigzagTest2 {

	public static void main(String[] args) {
		
		int[][] a = new int[4][6];
		int n = 0;
		
		int start = 0; // 2차원 배열에 숫자가 채워지기 시작하는 열 인덱스
		int end = a[0].length - 1; // 2차원 배열에 숫자가 채워지는 마지막 열의 인덱스
		int sw = 1; // start 부터 end 까지 증가치로 사용할 변수
		
		for (int i = 0; i<a.length; i++) {
//			숫자 채우기
//			i = 0, j = 0, 1, 2, 3, 4, 5
//			i = 1, j = 5, 4, 3, 2, 1, 0
//			i = 2, j = 0, 1, 2, 3, 4, 5
//			i = 3, j = 5, 4, 3, 2, 1, 0
			for (int j = start; j != end + sw; j += sw) {
				a[i][j] = ++n;
			}
			
			int temp = start;
			start = end;
			end = temp;
			sw *= -1;
		}
		
		for (int i = 0; i<a.length; i++) {
			for (int j = 0; j<a[i].length; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
