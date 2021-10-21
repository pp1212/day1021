package com.sist.exam02;

import java.util.ArrayList;

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void sayHello() {
		System.out.println(name+"님, 안녕하세요!");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class ArrayListTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();	//list안에 어떤 자료형이던지 담을 수 있음 ->get은 object반환하도록 만들어져 잇음
		list.add(true);
		list.add(new Person("홍길동",20));
		list.add(new Person("이순신",40));
		list.add(26.7);
		list.add(new Person("유관순",30));
		list.add("안녕 자바");
		list.add(2021);
		
		
		
		//list에 데이터가 있는 만큼 반복하면서
		//데이터를 하나씩 꺼내서 sayHello

		for(int i=0;i<list.size();i++) {
			Object obj = list.get(i);		//list안에 어떤 자료형이던지 담을 수 있음 ->get은 object반환하도록 만들어져 잇음
			System.out.println(obj);
			if(obj instanceof Person) {
				((Person)obj).sayHello();
			}
			//Person p = (Person)list.get(i);
			//p.sayHello();
			
		}
		
	}

}
