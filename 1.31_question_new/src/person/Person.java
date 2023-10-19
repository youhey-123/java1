package person;

public class Person {
    public String name;
    public int age;
    public double height;
    public double weight;
    
    // 問題1：クラスフィールド「count」を定義（初期値：0,データ型：int）
    private static int count = 0;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        
        // 問題2：Personコンストラクタの中でクラスフィールドcountに1を足す
        count++;
    }

    public double bmi() {
        return this.weight / this.height / this.height;
    }

    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "才です");
        System.out.println("BMIは" + Math.floor(this.bmi()) + "です");
    }
    
    //問題3用のゲッターメソッド
    public static int getCount() {
        return count;
    }

    // 問題4：クラスメソッド「printCount」を定義
    public static void printCount() {
    	
        // 問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力
        System.out.println("合計" + count + "人です");
    }
}
