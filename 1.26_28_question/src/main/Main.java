/*
 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */
package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
        // 学名を保存するためのマップを初期化。キーは動物の名前、値は学名。
        Map<String, String> scientificNames = new HashMap<>();
        
        // 各動物の名前とその学名をマップに追加
        scientificNames.put("ライオン", "パンテラ レオ");
        scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
        scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
        scientificNames.put("チンパンジー", "パン・トゥログロディテス");
        scientificNames.put("シマウマ", "チャップマンシマウマ");
        scientificNames.put("インコ", "不明");

        // コンソールからユーザーの入力を読み取るためのScannerを初期化
        Scanner scanner = new Scanner(System.in);
        
        // ユーザーに入力を促すメッセージを表示
        System.out.println("コンソールに文字を入力してください");
        
        // ユーザーからの入力を1行読み取り
        String input = scanner.nextLine();

        // 入力された文字列をカンマで分割し、動物の情報を配列として取得
        String[] animals = input.split(",");
        
        for (String animal : animals) {
        	
            // 各動物の情報をコロンで分割
            String[] details = animal.split(":");
            
            // 分割された情報から動物の名前、体長、速度を取得
            String name = details[0];
            String length = details[1];
            String speed = details[2];

            // 取得した情報をコンソールに出力
            System.out.println("動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            
            // 学名マップから動物の名前に基づいて学名を取得し、コンソールに出力
            System.out.println("学名：" + scientificNames.get(name));
            
            System.out.println();  // 改行を追加して出力を見やすくする
        }

        // 入力ストリームを閉じる
        scanner.close();
    }
}
