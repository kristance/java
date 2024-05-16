package k20231204;

public class RankingTest2 {

	public static void main(String[] args) {
		
		int[] score = {80, 100, 70, 100, 90, 84, 85};
		int[] rank = new int[score.length];
		for (int i = 0; i<rank.length; i++) {
			rank[i] = 1;
		}
		
		for (int i = 0; i<score.length - 1; i++) {
			for (int j = i + 1; j<score.length; j++) {
				
//				i번째 점수가 크면 j번째 석차를 1증가 시키고 j번째 점수가 크면 i번째 석차를 1증가 시킨다.
//				오름차순 석차를 계산하려면 부등호 방향을 모두 반대로 변경하면 된다.
				if (score[i] > score[j]) {
					rank[j]++;
				} else if (score[i] < score[j]) {
					rank[i]++;
				}
				
			}
		}
		
		for (int i = 0; i<score.length; i++) {
			System.out.printf("%3d점은 %d등 입니다. ", score[i], rank[i]);
//			별점 출력, 10점당 까만별 1개씩 출력한다.
			for (int j = 0; j<score[i] / 10; j++) {
				System.out.print("★");
			}
//			5점 단위로 흰별을 출력한다.
			if (score[i] % 10 >= 5) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
	}
	
}













