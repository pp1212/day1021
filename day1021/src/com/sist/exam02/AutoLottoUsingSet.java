package com.sist.exam02;

import java.util.Random;
import java.util.TreeSet;

public class AutoLottoUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet set = new TreeSet();		//정렬해줌
		Random r =new Random();
		
		while(set.size()<6) {
			set.add(r.nextInt(45)+1);		//nextInt는 마지막수의 -1까지의 난수 발생하니깐 마지막수 포함하려면 +1 해야 함
		}
		
		System.out.println(set);
	}

}
