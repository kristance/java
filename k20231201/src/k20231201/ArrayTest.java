package k20231201;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
//		배열이란 같은 이름으로 여러개의 기억장소를 만든다. 기억장소 구분은 인덱스(첨자)를 이용한다.
		
//		배열을 선언만 한다.
//		자료형[] 배열이름 = new 자료형[배열크기];
//		자료형 배열이름[] = new 자료형[배열크기];
		
//		배열을 선언만 하면 기본(자동) 초기화가 실행된다.
//		숫자는 0, 문자는 공백, boolean은 false, 기본 자료형을 제외한 나머지(클래스로 만든 객체)는 null로 초기화 된다.
		String[] data = new String[5];
		System.out.println(Arrays.toString(data));
		
//		배열을 선언하고 초기치로 초기화 한다.
//		자료형[] 배열이름 = {초기치}; // 초기치로 지정된 데이터 개수만큼 배열을 선언한다.
//		자료형 배열이름[] = {초기치};
		String[] name = {"홍길동", "임꺽정", "장길산", "일지매", "손오공", "손오반", "마인부우"};
		System.out.println(Arrays.toString(name));
		
//		모든 인덱스는 0부터 시작한다.
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println("=========================");
		
		for (int i=0; i<4; i++) {
			System.out.println(name[i]);
		}
		System.out.println("=========================");
		
//		배열이름.length: 배열의 크기를 얻어온다.
		System.out.println("name 배열의 크기: " + name.length);
		
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("=========================");
		
//		향상된 for => 배열이나 리스트의 전체를 대상으로 작업할 때 사용한다.
//		배열의 0번째 인덱스의 값이 변수에 저장된 후 반복을 시작하고 배열의 마지막 인덱스 값이 변수에 
//		저장된 후 반복하고 종료된다.
//		for (배열의 자료형 변수이름 : 배열이름) {
//			반복할 문장;
//			...
//		}
		
		for (String str : name) {
			System.out.println(str);
		}
		
	}
	
}




















