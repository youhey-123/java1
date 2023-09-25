package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//問１
		// バイト型
		byte byteVar;

		// 短整数型
		short shortVar;

		// 整数型
		int intVar;

		// 長整数型
		long longVar;

		// 単精度浮動小数点数型
		float floatVar;

		// 倍精度浮動小数点数型
		double doubleVar;

		// 文字型
		char charVar;

		// 文字列型
		String stringVar;

		// ブーリアン型
		boolean booleanVar;

		//問２
		byteVar = 0;

		// 短整数型
		shortVar = 0;

		// 整数型
		intVar = 0;

		// 長整数型
		longVar = 0L;

		// 単精度浮動小数点数型
		floatVar = 0.0f;

		// 倍精度浮動小数点数型
		doubleVar = 0.0;

		// 文字型
		charVar = '\u0000';

		// 文字列型
		stringVar = null;

		// ブーリアン型
		booleanVar = false;

		//問３
		// バイト型
		byteVar = 10;

		// 短整数型
		shortVar = 100;

		// 整数型
		intVar = 1000;

		// 長整数型
		longVar = 10000L;

		// 単精度浮動小数点数型
		floatVar = 9.5f;

		// 倍精度浮動小数点数型
		doubleVar = 10.5d;

		// 文字型
		charVar = 'a';

		// 文字列型
		stringVar = "ハロー";

		// ブーリアン型
		booleanVar = true;

		//問４
		// 11110 (数字を全て足す)
		int sum = byteVar + shortVar + intVar + (int) longVar;
		System.out.println(sum);

		// 20
		System.out.println(byteVar + byteVar);

		// a ハロー true
		System.out.println(charVar + " " + stringVar + " " + booleanVar);

		// 11130 (数字を全て足す)
		sum = byteVar + shortVar + intVar + (int) longVar + (int) floatVar + (int) doubleVar;
		System.out.println(sum);

		// 10000000000 (小数点以外の数字を全てかける)
		long longSum = byteVar * shortVar * intVar * longVar;
		System.out.println(longSum);

		// 0.105 (10.5を100で割る)
		float floatSum = (float) doubleVar / shortVar;
		System.out.println(floatSum);

		// -90 (10引く100をする)
		int result = byteVar - shortVar;
		System.out.println(result);

		//問５
		int num1 = 20;
		int num2 = 23;
		System.out.println("ハローJAVA" + (num1 + num2));

		//問６
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String favoriteFood = "寿司";

		// フォーマットに情報を埋め込んでコンソールに出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");

		//問７
		// BMIを計算
		double heightMeters = height / 100;
		double bmi = weight / (heightMeters * heightMeters);

		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

		//問８
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		favoriteFood = "オムライス";

		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");

		heightMeters = height / 100;
		bmi = weight / (heightMeters * heightMeters);

		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

		//問９
		name = "鈴木一郎";
		age += age;
		height += height;
		weight += weight;
		favoriteFood = "オムライス";

		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");

		heightMeters = height / 100;
		bmi = weight / (heightMeters * heightMeters);

		System.out.println("BMIは" + String.format("%.2f", bmi) + "です");

		//問１０
		age = 24;
		System.out.println(age >= 25);

		//問１１
		age = 24;
		height = 168.5;
		weight = 64.2;

		String sa = String.valueOf(age);
		String sh = String.valueOf(height);
		String sw = String.valueOf(weight);

		System.out.println(sa + sh + sw);

		//問１２
		int ia = Integer.parseInt(sa);
		double dh = Double.parseDouble(sh);
		int ih = (int) dh;

		//問１３
		// 年齢が25以上または身長が160以上であるかを判定
		boolean ageAndHeight = (ia >= 25) || (ih >= 160);

		// 条件に応じてtrueまたはfalseを出力
		System.out.println(ageAndHeight);

	}
}