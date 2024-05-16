package com.tjoeun.interfaceTest3;

//	VO(Value Object): 사용자 정보 데이터 1건과 데이터를 처리할 메소드를 모아놓은 클래스, DTO
public class UserInfoVO {

	private String userID;
	private String userName;
	private String userPassword;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	@Override
	public String toString() {
		return "UserInfoVO [userID=" + userID + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
}
