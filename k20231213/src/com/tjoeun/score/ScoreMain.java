package com.tjoeun.score;

public class ScoreMain {

	public static void main(String[] args) {
		
		/*
		ScoreVO score1 = new ScoreVO();
		ScoreVO score2 = new ScoreVO();
		ScoreVO score3 = new ScoreVO();
		
		System.out.println("score1.count: " + score1.count); // 0
		score2.count = 100;
//		static 변수는 현재 클래스로 생성하는 모든 객체에서 공유해서 사용하므로 score2의 count를
//		수정하면 score3과 score1의 count도 같이 수정된다.
		System.out.println("score3.count: " + score3.count); // 100
		System.out.println("score1.count: " + score1.count); // 100
		System.out.println("ScoreVO.count: " + ScoreVO.count); // 100
		*/
		
//		성적 데이터를 만든다.
		ScoreVO score1 = new ScoreVO("홍길동", 100, 100, 99);
		ScoreVO score2 = new ScoreVO("임꺽정", 45, 71, 59);
		ScoreVO score3 = new ScoreVO("장길산", 88, 80, 85);
		ScoreVO score4 = new ScoreVO("일지매", 82, 90, 81);
		ScoreVO score5 = new ScoreVO("손오공", 95, 83, 84);
//		System.out.println(score1);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
		
//		ArrayList에 성적 데이터를 넣어준다.
		ScoreList scoreList = new ScoreList();
		
		scoreList.addScore(score1);
		scoreList.addScore(score2);
		scoreList.addScore(score3);
		scoreList.addScore(score4);
		scoreList.addScore(score5);
		
		System.out.println(scoreList);
		
	}
	
}



















