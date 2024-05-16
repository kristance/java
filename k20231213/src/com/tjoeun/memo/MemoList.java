package com.tjoeun.memo;

import java.util.ArrayList;

public class MemoList {

	private ArrayList<MemoVO> memoList = new ArrayList<MemoVO>();

	public ArrayList<MemoVO> getMemoList() {
		return memoList;
	}
	public void setMemoList(ArrayList<MemoVO> memoList) {
		this.memoList = memoList;
	}
	
	@Override
	public String toString() {
		String str = "";
		if (memoList.size() == 0) { // 저장된 메모가 있는가?
//			저장된 메모가 없으면 메모가 없다는 메시지를 출력한다.
			str += "저장된 메모가 없습니다.\n";
		} else {
//			str += "저장된 " + memoList.size() + "개의 메모가 있습니다.\n";
//			저장된 메모가 있으면 저장된 메모 목록을 출력한다.
//			입력한 메모 순서대로 출력
//			for (int i = 0; i<memoList.size(); i++) {
//				str += memoList.get(i) + "\n";
//			}
//			입력한 메모의 역순으로 출력, 최신 글 부터 출력
			for (int i = memoList.size() - 1; i>=0; i--) {
				str += memoList.get(i) + "\n";
			}
			
		}
		return str;
	}
	
//	MemoMain 클래스에서 호출되는 memoList라는 ArrayList에 저장할 데이터가 저장된 MemoVO 클래스
//	객체를 넘겨받아 memoList라는 ArrayList에 저장하는 메소드
	public void addMemo(MemoVO vo) {
		memoList.add(vo);
	}
	
//	MemoMain 클래스에서 호출되는 memoList라는 ArrayList에 저장된 메모 1건을 얻어오 리턴하는 메소드
	public MemoVO selectMemo(int idx) {
		try {
			return memoList.get(idx - 1);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}
	
//	MemoMain 클래스에서 호출되는 memoList라는 ArrayList에 저장된 메모 1건을 삭제하는 메소드
	public void deleteMemo(int idx) {
		memoList.remove(idx - 1);
		
//		ArrayList는 데이터가 삽입될 경우 삽입되는 위치 이후의 데이터가 자동으로 뒤로 이동되고 
//		데이터가 삭제될 경우 삭제되는 위치 이후의 데이터가 자동으로 앞으로 이동된다.
//		메모 삭제 후 인덱스가 변경되므로 인덱스에 맞춰서 글번호를 다시 붙여준다.
//		이러한 현상은 데이터베이스를 사용하지 않고 ArrayList를 사용하기 때문에 발생되는 현상이다.
		
//		메모 삭제 후 글번호를 다시 붙여준다.
		for (int i = 0; i<memoList.size(); i++) {
			memoList.get(i).setIdx(i + 1);
		}
		
//		글이 삭제된 후 새 글이 입력될 때 idx가 기존 idx 값에 이어서 1씩 증가할 수 있도록 count의
//		값을 수정한다.
		MemoVO.count = memoList.size();
	}
	
//	MemoMain 클래스에서 호출되는 memoList라는 ArrayList에 저장된 메모 1건을 수정하는 메소드
	public void updateMemo(int idx, String memo) {
		memoList.get(idx - 1).setMemo(memo);
	}
	
}

















