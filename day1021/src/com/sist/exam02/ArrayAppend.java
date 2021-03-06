package com.sist.exam02;

public class ArrayAppend {
	
	public static void printArray(int []data) {
		for(int n:data) {
			System.out.printf("%5d",n);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []data = {10,20,30,40};
		printArray(data);
		
		//배열의 맨 뒤에 50 추가하고 싶음
		//1.data 배열 참조변수가 원래배열의 길이+1만큼 다시 메모리 확보
		//2.data 배열의 요소를 모두 새로 확보한 배열을 이동
		//3.새로확보한 배열의 마지막에 50 대입
		
		//data = new int[data.length+1]; ->참조하는거 사라짐
		int []data2 = new int[data.length+1];
		for(int i=0;i<data.length;i++) {
			data2[i] = data[i];
		}
		data2[data2.length-1] = 50;
		data = data2;
		printArray(data2);
		
		//배열은 데이터의 추가,삭제 작업이 빈번한 경우에는
		//번거로움
		//그래서 컬렉션프레임워크를 사용함
		
	}

}
