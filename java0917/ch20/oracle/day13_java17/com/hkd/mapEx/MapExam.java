package com.hkd.mapEx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExam {
	public MapExam() {
		Map<String, Integer> HashMap = new HashMap<>();
		HashMap.put("사과", 1000);
		HashMap.put("바나나", 500);
		HashMap.put("오렌지", 800);
		HashMap.put("사과", 1200);
		
		System.out.println(HashMap);
		System.out.println("사과 가격: "+HashMap.get("사과"));
		
		Map<String, String> treeMap = new TreeMap();
		treeMap.put("서울", "seoul");
		treeMap.put("부산", "Busan");
		treeMap.put("대구", "Daegu");
		treeMap.put("인천", "inCheon");
		
		System.out.println("treeMap 키 정렬");
		System.out.println(treeMap);
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(3, "셋");
		linkedHashMap.put(2, "둘");
		linkedHashMap.put(1, "하나");
		linkedHashMap.put(4, "음");
		
		System.out.println("linkedHashMap 키 정렬");
		System.out.println(linkedHashMap);
		
	}
}
