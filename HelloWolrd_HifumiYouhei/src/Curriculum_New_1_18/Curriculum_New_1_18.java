package Curriculum_New_1_18;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	public static void printMessage(String message, int version) {
		// 結合したメッセージを表示する
		System.out.println(message + " JavaSE " + version);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	public static void multiply(int a, int b) {
		// 乗算の結果を表示する
		System.out.println(a * b);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	//整数の配列を渡す
	public static void printArray(int[] array) {
		// 各整数を順に表示する
		for (int num : array) {
			System.out.println(num);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	//Q2のオーバーロード
	public static void multiply(double a, double b) {
		// 和を表示する
		System.out.println(a + b);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	public static int[] generateRandomNumbers(int count) {
		// ランダムな数字を保存するための配列
		int[] randomNumbers = new int[count];
		for (int i = 0; i < count; i++) {
			// 1〜100のランダムな数字を生成
			randomNumbers[i] = 1 + (int) (Math.random() * 100);
			System.out.println(randomNumbers[i]);
		}
		return randomNumbers;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	public static double printAverage(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			// 配列のすべての要素の合計を計算する
			sum += num;
		}

		// 平均値を計算する
		double average = (double) sum / numbers.length;
		System.out.println("平均: " + average);
		return average;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static boolean checkIfAbove50(double average) {
		// 平均値が50以上かどうかの結果を保存する
		boolean result = average >= 50;
		System.out.println(result);
		return result;
	}

	//	以下メソッドの呼び出し
	public static void main(String[] args) {

		// Q1のメソッド呼び出し
		printMessage("Hello", 11);

		// Q2のメソッド呼び出し
		multiply(5, 6);

		// Q3のメソッド呼び出し
		printArray(new int[] { 1, 2, 3, 4, 5 });

		// Q4のメソッド呼び出し
		multiply(5.5, 6.5);

		// Q5のメソッド呼び出し
		int[] numbers = generateRandomNumbers(10);

		// Q6のメソッド呼び出し
		double average = printAverage(numbers);

		// Q7のメソッド呼び出し
		checkIfAbove50(average);

	}
}