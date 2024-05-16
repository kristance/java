package com.tjoeun.interfaceTest3;

public class UserInfoOracleDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoVO userInfoVO) {
		System.out.println("insert into OracleDB userID = " + userInfoVO.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfoVO userInfoVO) {
		System.out.println("update OracleDB userID = " + userInfoVO.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfoVO userInfoVO) {
		System.out.println("delete from OracleDB userID = " + userInfoVO.getUserID());
	}

}
