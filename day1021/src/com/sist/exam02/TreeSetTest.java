package com.sist.exam02;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet set = new TreeSet();
		set.add("���");
		set.add("����");
		set.add("����");
		System.out.println(set);
		System.out.println(set.size());		//3
		set.add("�ٳ���");
		set.add("���");
		set.add("��");
		set.add("��");
		System.out.println(set);
		System.out.println(set.size());		//6
		
		set.remove("����");
		System.out.println(set);
		System.out.println(set.size());		//5
	}

}
