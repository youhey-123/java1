package person;

import vehicle.Bicycle;
import vehicle.Car;

public class Person {
	public static int count = 0;
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;

	public Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;

		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String fullName() {
		return this.firstName + " " + this.lastName;
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "歳です");
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}

	// 問題6: インスタンスメソッドbuyを定義
	public void buy(Car car) {
		// 問題7 & 8: setOwnerメソッドとthisを用いてownerをセットして、出力
		    car.setOwner(this.fullName());
		    System.out.println(this.fullName() + "が車を購入しました");
		}

	// 問題9: 引数の型が異なるbuyメソッドを定義
	public void buy(Bicycle bicycle) {
	    bicycle.setOwner(this.fullName());
	    System.out.println(this.fullName() + "がバイクを購入しました");
	}
}
