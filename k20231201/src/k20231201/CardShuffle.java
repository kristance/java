package k20231201;

import java.util.Random;

public class CardShuffle {

	public static void main(String[] args) {
		
		/*
//		두 기억장소에 저장된 값 교환하기
		int a = 3, b = 4;
		System.out.println("a = " + a + ", b = " + b);
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a + ", b = " + b);
		*/
		
//		카드 출력에 사용할 숫자와 무늬를 기억하는 배열을 만든다.
		String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] symbol = {"♠", "◇", "♥", "♧"};
		
//		cards 라는 int형 배열을 만들고 0 ~ 51로 초기화 한다.
		int[] cards = new int[52];
		for (int i = 0; i<cards.length; i++) {
			cards[i] = i;
		}
		
//		섞기전 상태를 출력한다.
		for (int i = 0; i<cards.length; i++) {
//			System.out.printf("%2d ", cards[i]); // cards 배열의 값
//			System.out.printf("%2s ", number[cards[i]%13]); // 숫자만
//			System.out.printf("%s ", symbol[cards[i]/13]); // 무늬만
			System.out.printf("%s%2s ", symbol[cards[i]/13], number[cards[i]%13]);
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
		System.out.println("================================================== 섞기전");
		
//		섞는다.
//		cards[0]와 cards[1] ~ cards[51] 사이의 랜덤한 위치의 값을 선택해서 값을 교환한다.
		Random random = new Random();
		for (int i = 0; i<1000000; i++) {
			int r = random.nextInt(51) + 1;
			int temp = cards[0];
			cards[0] = cards[r];
			cards[r] = temp;
		}
		
//		섞은후 상태를 출력한다.
		for (int i = 0; i<cards.length; i++) {
			System.out.printf("%s%2s ", symbol[cards[i]/13], number[cards[i]%13]);
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
		System.out.println("================================================== 섞은후");
		
	}
	
}






















