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
			System.out.print("������ �Է��ϼ���==>");
			list.add(sc.nextDouble());
			if(list.get(i)>=0.0 && list.get(i)<=10.0) {
				tot += (double)list.get(i);
			}else {
				System.out.println("�߸��� �����Դϴ�.");
			}		
		}
		Collections.sort(list);
		tot -= list.get(0);
		tot -= list.get(9);
		System.out.println("�� ����:"+tot);
	}

}
