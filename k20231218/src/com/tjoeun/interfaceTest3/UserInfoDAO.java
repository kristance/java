package com.tjoeun.interfaceTest3;

//	DAO(Data Access Object): 데이터베이스에 접근해서 sql 명령을 실행하는 클래스
public interface UserInfoDAO {

//	메소드 명세
	public abstract void insertUserInfo(UserInfoVO userInfoVO); // 사용자 정보를 저장하는 메소드
	void updateUserInfo(UserInfoVO userInfoVO); // 사용자 정보를 수정하는 메소드
	void deleteUserInfo(UserInfoVO userInfoVO); // 사용자 정보를 삭제하는 메소드
	
}
 