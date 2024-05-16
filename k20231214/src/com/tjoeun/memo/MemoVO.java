package com.tjoeun.memo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MemoVO {

	public static int count;
	private int idx;
	private String name;
	private String password;
	private String memo;
	private Date writeDate;
	
	public MemoVO() { }
	public MemoVO(String name, String password, String memo) {
		idx = ++count;
		this.name = name;
		this.password = password;
		this.memo = memo;
		writeDate = new Date();
	}
//	모든 데이터를 넘겨받아 초기화 시키는 생성자
	public MemoVO(int idx, String name, String password, String memo, Date writeDate) {
		super();
		this.idx = idx;
		this.name = name;
		this.password = password;
		this.memo = memo;
		this.writeDate = writeDate;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss.SSS");
		return String.format("%d. %s(%s)님이 %s에 남긴글\n%s", idx, name, password, sdf.format(writeDate), memo);
	}
	
}








