package com.sist.exam02;

import java.util.Random;

public class AutoLottoUsingArray {

	public static void printArray(int []data) {
		for(int n:data) {
			System.out.print(n+"\t");
		}
		System.out.println();
	}
	public static boolean isAlready(int value, int last, int []arr) {	//중복금지
		//arr배열에서 value 값이 last까지 찾았을 때 있냐
		boolean flag = false;
		for(int i=0; i<=last;i++) {
			if(arr[i]==value) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public static void sortArray(int []arr) {				//오름차순으로 정렬하기 위해서
		for(int i=0;i<arr.length;i++) {						//자기랑 다음꺼랑 비교
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//로또는 1~45까지 6개의 숫자를 선택(중복없이)
		int []n = new int[6];
		
		Random r = new Random();
		for(int i=0;i<6;) {
			int temp = r.nextInt(45) +1;	 
			if( !isAlready(temp, i, n) ) {  //isAlready(temp, i, n) == false
				n[i] = temp;					//이 문장 만나도록
				i++;
			}
		}
		sortArray(n);
		printArray(n);
		
	}

}
