package com.sist.exam03;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("ȫ�浿");
		list.add(26.7);
		list.add(new Date());
		list.add(true);
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<String>();
		//list2.add(100);		���׸��� ����Ͽ� String�� ���� �� �ְ� �Ͽ��� ������ int ���� �� ����
		list2.add("ȫ�浿");
		list2.add("������");
		list2.add("�̼���");
		System.out.println(list2);
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add(100+"");
		list3.add("ȫ�浿");
		list3.add(26.7+"");
		list3.add(new Date()+"");
		list3.add(true+"");
		System.out.println(list3);
		
		
		//ArrayList<int> list4 = new Arraylist<int>();
		//list�� ���� �� �ִ� �ڷ����� ���������� �����ϱ� ���Ͽ�
		//�⺻�ڷ����� int�� ����� �� ����
		//�⺻�ڷ��� int�� ��ü����� �ִ� IntegerŬ������ ����ؾ� ��
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(50);
		list4.add(60);
		list4.add(70);
		list4.add(80);
		//list4.add(85.7);		//int�� �ƴ϶� ���� �� ����
		System.out.println(list4);
		
		
		
	}

}