package k20231204;

import java.util.Arrays;
import java.util.Random;

public class PowerBallTest {

	public static void main(String[] args) {
		
//		추첨 규칙: 1 ~ 69 중에서 5개, 1 ~ 26 중에서 1개
		
		int[] powerBall = new int[69];
		for (int i = 0; i<powerBall.length; i++) {
			powerBall[i] = i + 1;
		}
//		System.out.println(Arrays.toString(powerBall));
		
		show(powerBall);
		System.out.println("\n=================================== 섞기전");
		
		Random random = new Random();
		for (int i = 0; i<1000000; i++) {
			int r = random.nextInt(68) + 1;
			int temp = powerBall[0];
			powerBall[0] = powerBall[r];
			powerBall[r] = temp;
		}
		
		show(powerBall);
		System.out.println("\n=================================== 섞은후");
		
		System.out.print("흰공: ");
		for (int i = 0; i<5; i++) {
			System.out.printf("%2d ", powerBall[i]);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.printf("빨강공: %2d ", random.nextInt(26) + 1);
		
	}

	private static void show(int[] powerBall) {
		for (int i = 0; i<powerBall.length; i++) {
			System.out.printf("%2d ", powerBall[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
	
}












