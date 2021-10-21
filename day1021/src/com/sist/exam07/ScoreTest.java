package com.sist.exam07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> list = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		double tot = 0.0;
		
		for(int i=0 ; i<10 ;i++) {
			System.out.print("점수를 입력하세요==>");
			list.add(sc.nextDouble());
			if(list.get(i)>=0.0 && list.get(i)<=10.0) {
				tot += (double)list.get(i);
			}else {
				System.out.println("잘못된 점수입니다.");
			}		
		}
		Collections.sort(list);
		tot -= list.get(0);
		tot -= list.get(9);
		System.out.println("총 점수:"+tot);
	}

}
