package com.tjoeun.collectionTest;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest2 {

	public static void main(String[] args) {

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("apple", 1000);
		hmap.put("banana", 2000);
		hmap.put("orange", 3000);
		hmap.put("melon", 20000);
		hmap.put("water melon", 15000);
		System.out.println(hmap.size() + " : " + hmap);

		
//		keySet() 메소드는 HashMap에 저장된 데이터의 key만 얻어온다.
		System.out.println(hmap.keySet());
		
//		values() 메소드는 HastMap에 저장된 데이터의 value만 얻어온다.
		System.out.println(hmap.values());
		
//		HashMap에 저장된 데이터의 key만 얻어와서 ArrayList에 저장하기
		ArrayList<String>  keyList = new ArrayList<>();
		for (String key : hmap.keySet()) {
			keyList.add(key);
		}
		System.out.println(keyList);
		
//		HashMap에 저장된 데이터의 value만 얻어와서 ArrayList에 저장하기
		ArrayList<Integer>  valueList = new ArrayList<>();
		for (int value : hmap.values()) {
			valueList.add(value);
		}
		System.out.println(valueList);
		
//		HashMap에 저장된 데이터의 key를 이용해서 value를 얻어와서 ArrayList에 저장하기
		ArrayList<Integer>  valueList2 = new ArrayList<>();
		for (String key : hmap.keySet()) {
			valueList2.add(hmap.get(key));
		}
		System.out.println(valueList2);
		
		
		
		
		
	}
}
