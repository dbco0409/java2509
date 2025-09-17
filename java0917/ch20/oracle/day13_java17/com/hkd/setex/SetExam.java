package com.hkd.setex;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	public SetExam() {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Java");
		hashSet.add("Python");
		hashSet.add("JavaScript");
		hashSet.add("Java");
		System.out.println(hashSet);
		System.out.println("-----------");
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(30);
		treeSet.add(10);
		treeSet.add(50);
		treeSet.add(20);
		treeSet.add(10);
		
		System.out.println(treeSet);
		System.out.println("-----------");
		
		Set<String> linkedhashSet = new LinkedHashSet<>();
		linkedhashSet.add("첫째");
		linkedhashSet.add("둘째");
		linkedhashSet.add("셋째");
		linkedhashSet.add("넷째");
		System.out.println(linkedhashSet);
		
	}
}
