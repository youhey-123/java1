package main;

import person.Person;
import vehicle.Bicycle;
import vehicle.Car;  

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
        //person1.print();
        Person person2 = new Person("山田", "花子", 22, 1.5, 40);
        //person2.print();
        
        //Person.printCount();

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
 
        // 問題4: ownerを設定
        car.setOwner(person1.fullName());
        bicycle.setOwner(person2.fullName());

        // 問題5: ownerをコンソールに出力
        System.out.println(car.getOwner());
        System.out.println(bicycle.getOwner());

        // 問題10: 乗り物を購入
        person1.buy(car);
        person2.buy(bicycle);
    }
}
