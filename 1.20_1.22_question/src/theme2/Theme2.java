package theme2;

import processing.Processing;

public class Theme2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 
		下記がコンソールに出力されるように作成してください
		
			こんにちは！ここは日本です！
			この寿司はうまい
			寿司は和食です
			今の現在日時は2023/03/09 10:23:39です
		
		【条件】
			・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
			・適切なファイルにフィールドで変数を必要な数作ってください。
			・thisを使って作成してください。
			・日時は今日の日付を取得してください。
			
		*/
		 // Processingクラスのインスタンスを作成し、message変数に格納
		Processing message = new Processing();

		 // messageオブジェクトのprintGreetingメソッド呼び出し
		message.printGreeting();
		 // messageオブジェクトのprintSushiTasteメソッド呼び出し
		message.printSushiTaste();
		 // messageオブジェクトのprintSushiCategoryメソッド呼び出し
		message.printSushiCategory();
		 // message`オブジェクトのprintCurrentDateTimeメソッド呼び出し
		message.printCurrentDateTime();
	}

}
