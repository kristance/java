package k20231211;

import java.util.ArrayList;

public class ArrayListMethodTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
//		add(value): ArrayList의 맨 뒤에 value를 추가한다.
		list.add("홍길동");
//		size(): ArrayList에 저장된 데이터의 개수를 얻어온다.
		System.out.println(list.size() + ": " + list);
		list.add("임꺽정");
		System.out.println(list.size() + ": " + list);
		list.add("장길산");
		System.out.println(list.size() + ": " + list);
		list.add("일지매");
		System.out.println(list.size() + ": " + list);
		list.add("홍길동");
		System.out.println(list.size() + ": " + list);
		
//		add(index, value): ArrayList의 index 번째 위치에 value를 삽입한다.
		list.add(2, "손오공");
		System.out.println(list.size() + ": " + list);
		
//		set(index, value): ArrayList의 index 번째 위치에 데이터를 value로 수정한다.
		list.set(2, "저팔계");
		System.out.println(list.size() + ": " + list);
		
//		get(index): ArrayList의 index 번째 위치의 데이터를 얻어온다.
		for (int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (String str : list) {
			System.out.println(str);
		}
		
//		remove(index): ArrayList의 index 번째 위치의 데이터를 제거한다.
		list.remove(2);
		System.out.println(list.size() + ": " + list);
		
//		remove(Object): ArrayList에서 인수로 지정된 데이터를 제거한다. 같은 데이터가 있으면 앞의 데이터가 제거된다.
		list.remove("홍길동");
		System.out.println(list.size() + ": " + list);
		
//		clear(): ArrayList에 저장된 모든 데이터를 제거한다.
		list.clear();
		System.out.println(list.size() + ": " + list);
		
	}
	
}
















