package com.sist.exam02;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet data = new HashSet();
		data.add("사과");
		data.add("포도");
		data.add("수박");
		data.add("귤");		//얼마든지 동적으로 담을 수 있음
		System.out.println(data);
		data.add("오렌지");
		data.add("사과");
		System.out.println(data);
		
		//순서유지X
	}

}
