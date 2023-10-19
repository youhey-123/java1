package main;

import person.Person;

public class Main {
	public static void main(String[] args) {

		//問題5：Main.javaの引数にweightの60を入れてください
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		//person1の情報を取得し、コンソールに表示
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		System.out.println(person1.getHeight());
		
		System.out.println();//改行
		
		//printメソッドを出力
		person1.print();
		
		System.out.println();//改行

		// 問題10：人数の合計を「合計○人です」と出力
		System.out.println("合計" + Person.getCount() + "人です");
	}
}
