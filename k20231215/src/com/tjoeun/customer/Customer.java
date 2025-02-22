package com.tjoeun.customer;

import java.text.NumberFormat;

//	부모 클래스
//	일반 고객 정보를 기억하는 클래스
public class Customer {

	private int customerID; // 고객 ID
	private String customerName; // 고객 이름
	private String customerGrade; // 고객 등급
	private int bonusPoint; // 보너스 포인트
	private double bonusRatio; // 보너스 포인트 적립 비율
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}

//	회원 정보를 리턴하는 메소드
//	이몽룡님의 등급은 SILVER이며, 보너스 포인트는 1,000점 입니다.
	public String showCustomerInfo() {
		NumberFormat nf = NumberFormat.getNumberInstance();
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + 
				nf.format(bonusPoint) + "점 입니다.";
	}

//	구매 금액을 인수로 넘겨받아 보너스 포인트를 계산해서 리턴하는 메소드
	public int calcBonus(int price) {
		return (int) (price * bonusRatio);
	}

//	구매 금액을 인수로 넘겨받아 누적 보너스 포인트를 계산해서 리턴하는 메소드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
//		대입 연산자는 오라클 공식 문서를 살펴보먼 아래와 같이 내부적으로 변환되서 처리된다.
//		bonusPoint = (bonusPoint의 자료형) (bonusPoint + price * bonusRatio);
//		bonusPoint = (int) (bonusPoint + price * bonusRatio);
//		bonusPoint += calcBonus(price);
		return bonusPoint;
	}
	
}




















