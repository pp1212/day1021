package com.sist.homework01;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Lotto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		
		for(int i=0 ; i<5 ; i++) {
			TreeSet set = new TreeSet();
			Random r = new Random();
			while(set.size()<6) {
				set.add(r.nextInt(45)+1);		
			}
			list.add(set);	
		}
		
		for(int j=0 ; j<list.size() ; j++) {
			System.out.println(list.get(j));
		}
	}
}
