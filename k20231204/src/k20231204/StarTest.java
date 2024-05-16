package k20231204;

public class StarTest {

	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
//		*****
		
//		i = 0, j = 0
//		i = 1, j = 0, 1
//		i = 2, j = 0, 1, 2
//		i = 3, j = 0, 1, 2, 3
//		i = 4, j = 0, 1, 2, 3, 4
		
//		바깥 반복의 변수값이 1번 변경될 때 안쪽 반복은 완전히 1번이 실행된다.
//		바깥 반복과 안쪽 반복의 제어 변수는 같은 이름의 변수를 사용하면 안된다.
		for (int i = 0; i<5; i++) {
			for (int j = 0; j<=i; j++) {
//				System.out.println("i = " + i + ", j = " + j);
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========================");
		
//		*****
//		****
//		***
//		**
//		*
		
//		i = 0, j = 0, 1, 2, 3, 4
//		i = 1, j = 0, 1, 2, 3
//		i = 2, j = 0, 1, 2
//		i = 3, j = 0, 1
//		i = 4, j = 0
		
		for (int i = 0; i<5; i++) {
			for (int j = 0; j<=4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========================");
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		for (int i = 0; i<5; i++) {
			for (int j = 0; j<=3-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========================");
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		for (int i = 0; i<5; i++) {
			for (int j = 0; j<=i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j<=4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========================");
		
//		*       *
//		**     **
//		***   ***
//		**** ****
//		*********
		
		for (int i = 0; i<5; i++) {
			for (int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j<7-i*2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j<=i; j++) {
				if (j == 4) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
















