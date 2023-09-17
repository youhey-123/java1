package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//問１
		// バイト型
		byte byteVariable;

		// 短整数型
		short shortVariable;

		// 整数型
		int intVariable;

		// 長整数型
		long longVariable;

		// 単精度浮動小数点数型
		float floatVariable;

		// 倍精度浮動小数点数型
		double doubleVariable;

		// 文字型
		char charVariable;

		// 文字列型
		String stringVariable;

		// ブーリアン型
		boolean booleanVariable;
		
		

		//問２
		byteVariable = 0;

		// 短整数型
		shortVariable = 0;

		// 整数型
		intVariable = 0;

		// 長整数型
		longVariable = 0;

		// 単精度浮動小数点数型
		floatVariable = 0;

		// 倍精度浮動小数点数型
		doubleVariable = 0;

		// 文字型
		charVariable = 'a';

		// 文字列型
		stringVariable = "ハロー";

		// ブーリアン型
		booleanVariable = true;

		
		
		//問３
		// バイト型
		byteVariable = 10;

		// 短整数型
		shortVariable = 100;

		// 整数型
		intVariable = 1000;

		// 長整数型
		longVariable = 10000L;

		// 単精度浮動小数点数型
		floatVariable = 9.5f;

		// 倍精度浮動小数点数型
		doubleVariable = 10.5;

		// 文字型
		charVariable = 'a';

		// 文字列型
		stringVariable = "ハロー";

		// ブーリアン型
		booleanVariable = true;
		
		

		//問４
		// 11110 (数字を全て足す)
		int sum = byteVariable + shortVariable + intVariable + (int) longVariable;
		System.out.println(sum);

		// 20
		System.out.println(shortVariable);

		// a ハロー true
		System.out.println(charVariable + " " + stringVariable + " " + booleanVariable);

		// 11130 (数字を全て足す)
		sum = byteVariable + shortVariable + intVariable + (int) longVariable + 20;
		System.out.println(sum);

		// 10000000000 (小数点以外の数字を全てかける)
		long longSum = byteVariable * shortVariable * intVariable * longVariable * 20L;
		System.out.println(longSum);

		// 0.105 (10.5を100で割る)
		float floatSum = (float) doubleVariable / 100;
		System.out.println(floatSum);

		// -90 (10引く100をする)
		int difference = 100 - intVariable;
		System.out.println(-difference);
		
		

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
		age = age + 24;
		height = height + 168.5;
		weight = weight + 64.2;
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
		boolean age25 = (age >= 25) ? true : false;
		System.out.println(age25);
		
		

		//問１１
		String output = "年齢は" + String.valueOf(age) + "歳です。" + "身長は" + String.valueOf(height) + "cmです。" + "体重は"
				+ String.valueOf(weight) + "kgです。";

		System.out.println("初めまして" + name + "です");
		System.out.println(output);
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		
		

		//問１２
		int ageStr = (int)age;
        int heightStr = (int)height;

        System.out.println("年齢は" + ageStr+ "歳です。");
        System.out.println( "身長は" + heightStr + "cmです。");
        
        
        
        //問１３
     // 年齢が25以上または身長が160以上であるかを判定
        boolean ageAndHeight = (age >= 25) || (height >= 160);

        // 条件に応じてtrueまたはfalseを出力
        System.out.println(ageAndHeight);
		
	}

}
