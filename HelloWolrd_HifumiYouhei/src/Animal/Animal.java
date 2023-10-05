package Animal;

import java.time.LocalDateTime; // 日時を取得するためのライブラリ
import java.time.format.DateTimeFormatter; // 日時を指定した形式に変換するためのライブラリ

import Dog.Dog; // Dogクラスを使用するためのインポート

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
		 // Dogクラスのオブジェクトを作成
		Dog dogWithName = new Dog();
		// 作成したDogオブジェクトのnameをコンソールに表示
		System.out.println(dogWithName.name); ; 

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		 // 数を指定してDogクラスのオブジェクトを作成
		Dog dogWithCount = new Dog(3);
		// 作成したDogオブジェクトのcountをコンソールに表示
		System.out.println(dogWithCount.count); 
		
		// Q3 :現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		 // 現在の日時を取得
		LocalDateTime now = LocalDateTime.now();
		// 日時を「yyyy-MM-dd H:m:s」の形式に変換するための設定
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		// 現在の日時を指定した形式に変換
		String formattedNow = now.format(formatter);
		// 変換した日時をコンソールに表示
		System.out.println(formattedNow);
	}
}
