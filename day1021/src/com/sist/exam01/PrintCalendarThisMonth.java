package com.sist.exam01;

import java.util.Date;
import java.util.Scanner;

public class PrintCalendarThisMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요==>");
		int year = sc.nextInt()-1900;			//여기서 바로 빼줌
		
		System.out.print("월을 입력하세요==>");
		int month = sc.nextInt()-1;
		
		
	
		Date startDate = new Date(year,month,1);
		
		int day = startDate.getDay();	//요일
		System.out.printf("%d년 %d월\n",year+1900,month+1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//그 달의 1일의 요일만큼 빈칸을 출력
		for(int i=1;i<=day;i++) {
			System.out.print("\t");
		}
		
		
		int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//달력의 날짜를 제대로 출력하도록 코드를 수정해 본다
		for(int i=1; i<=lastDate[month] ; i++) {
			System.out.print(i+"\t");
			if((i+day) % 7 == 0) {
				System.out.println();
			}
		}
		
		/*
		for(int i=1;i<=31;i++) {
			System.out.print(i+"\t");
			if((i+day) % 7 == 0) {
				System.out.println();
			}
		}
		*/
		
		
	}

}
