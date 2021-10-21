package com.sist.homework03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.sist.exam04.Student;

public class Programming11 {

	public static Scanner sc = new Scanner(System.in);
	
	public static void printMenu() {
		System.out.print("**�������**\n1.�߰�, 2.�˻�, 3.����, 4.��ü���, 0.����\n");
		System.out.print("�޴��� �����ϼ���-->");
	} 
	
	public static void insertWord(HashMap<String, String> map) {
		String word,meaning;
		System.out.print("�ܾ �Է��ϼ���==>");
		word = sc.next();
		System.out.print("�� �ܾ��� ���� �Է��ϼ���==>");
		meaning = sc.next();
		map.put(word, meaning);
	}
	
	public static void searchWord(HashMap<String, String> map) {
		String word;
		System.out.print("�˻��� �ܾ �Է��ϼ���=>");
		word = sc.next();
		if(word != null) {
			System.out.printf("�� �ܾ��� ���� %s�Դϴ�.\n",map.get(word));
		}else {
			System.out.println("ã���� �ϴ� �ܾ �����ϴ�.");
		}
	}
	
	public static void deleteWord(HashMap<String, String> map) {
		String word;
		System.out.print("������ �ܾ �Է��ϼ���=>");
		word = sc.next();
		map.remove(word);
		System.out.printf("%s �ܾ �����Ͽ����ϴ�.\n",word);
	}
	
	public static void printAll(HashMap<String, String> map) {
		if(map.isEmpty()) {
			System.out.println("�����Ͱ� �����ϴ�.");
		}else {
			for(String key : map.keySet()) {
				String value = map.get(key);
				System.out.printf("%s : %s\n",key,value);
			}
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("school", "�б�");
		map.put("teacher", "����,����");
		map.put("student", "�л�");
		map.put("book", "å");
		
		while(true) {
			printMenu();
			int menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
			
			switch(menu) {
				case 1:insertWord(map);break;
				case 2:searchWord(map);break;
				case 3:deleteWord(map);break;
				case 4:printAll(map);break;
			}
		}
	}

}
