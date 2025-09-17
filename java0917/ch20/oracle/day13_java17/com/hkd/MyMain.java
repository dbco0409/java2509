package com.hkd;

import com.geex.GenericExam;
import com.hkd.listex.ListExam;
import com.hkd.mapEx.MapExam;
import com.hkd.setex.SetExam;

public class MyMain {

	public static void main(String[] args) {
		// List : 순서 o, 중복 가능 O
//		ListExam listExam = new ListExam();
//		
//		// Set : 순서 없음, 중복 안됨 (대량 안됨)
//		SetExam setExam = new SetExam();
//		
//		// Map : Key, value, 키에 접근, 값을 가져오는 방식 - json과 닮았음
//		MapExam mapExam = new MapExam();
		// 제네릭 없는 버전
		GenericExam genericExam = new GenericExam();
	}

}
