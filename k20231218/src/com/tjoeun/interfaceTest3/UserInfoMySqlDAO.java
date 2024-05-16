package com.tjoeun.interfaceTest3;

public class UserInfoMySqlDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoVO userInfoVO) {
		System.out.println("insert into MySqlDB userID = " + userInfoVO.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfoVO userInfoVO) {
		System.out.println("update MySqlDB userID = " + userInfoVO.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfoVO userInfoVO) {
		System.out.println("delete from MySqlDB userID = " + userInfoVO.getUserID());
	}

}
