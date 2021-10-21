package com.sist.homework03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.sist.exam04.Student;

public class Programming11 {

	public static Scanner sc = new Scanner(System.in);
	
	public static void printMenu() {
		System.out.print("**영어사전**\n1.추가, 2.검색, 3.삭제, 4.전체출력, 0.종료\n");
		System.out.print("메뉴를 선택하세요-->");
	} 
	
	public static void insertWord(HashMap<String, String> map) {
		String word,meaning;
		System.out.print("단어를 입력하세요==>");
		word = sc.next();
		System.out.print("이 단어의 뜻을 입력하세요==>");
		meaning = sc.next();
		map.put(word, meaning);
	}
	
	public static void searchWord(HashMap<String, String> map) {
		String word;
		System.out.print("검색할 단어를 입력하세요=>");
		word = sc.next();
		if(word != null) {
			System.out.printf("이 단어의 뜻은 %s입니다.\n",map.get(word));
		}else {
			System.out.println("찾고자 하는 단어가 없습니다.");
		}
	}
	
	public static void deleteWord(HashMap<String, String> map) {
		String word;
		System.out.print("삭제할 단어를 입력하세요=>");
		word = sc.next();
		map.remove(word);
		System.out.printf("%s 단어를 삭제하였습니다.\n",word);
	}
	
	public static void printAll(HashMap<String, String> map) {
		if(map.isEmpty()) {
			System.out.println("데이터가 없습니다.");
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
		map.put("school", "학교");
		map.put("teacher", "교사,선생");
		map.put("student", "학생");
		map.put("book", "책");
		
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
