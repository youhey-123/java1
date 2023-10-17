package person;

public class Person {

	// 問題1：インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;

	// 問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
	private double weight;

	// 静的フィールドで全Personインスタンスの数を追跡
	private static int count = 0;

	// 問題2：コンストラクタを定義
	// 問題3：コンストラクタの中で各インスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	// 問題6：インスタンスメソッド「bmi」を定義
	// 問題7：bmiメソッドでインスタンスのBMIを返す処理
	double bmi() {
		return weight / (height * height);
	}

	// 問題8：インスタンスメソッド「print」を定義
	// 問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + Math.floor(this.bmi()) + "です");
	}

	//ゲッターメソッドを追加して情報を取得
	public static int getCount() {
		return count;
	}
}
