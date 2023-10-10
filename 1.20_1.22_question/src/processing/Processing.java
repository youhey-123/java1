package processing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Processing {
	//各文字列に対応した変数を定義
	public String greeting = "こんにちは！ここは日本です！";
	public String sushiTaste = "この寿司はうまい";
	public String sushiCategory = "寿司は和食です";
    
    // greeting変数の内容を出力するメソッド
    public void printGreeting() {
        System.out.println(this.greeting);
    }

    // sushiTaste変数の内容を出力するメソッド
    public void printSushiTaste() {
        System.out.println(this.sushiTaste);
    }

    // sushiCategory変数の内容を出力するメソッド
    public void printSushiCategory() {
        System.out.println(this.sushiCategory);
    }

    // 現在の日付と時間を出力するメソッド
    public void printCurrentDateTime() {
    	
        // 現在の日付と時間を取得する
        Date now = new Date();
        
        // 日付と時間のフォーマットを設定する
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        // フォーマットした日付と時間を出力する
        System.out.println("今の現在日時は" + formatter.format(now) + "です");
    }
}