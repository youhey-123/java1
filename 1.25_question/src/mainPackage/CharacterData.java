/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */

package mainPackage;

import java.util.Scanner;

import characterPackage.GetCharacterData;
import characterPackage.SetCharacterData;

public class CharacterData {
    public static void main(String[] args) {
        // Scannerインスタンスを作成してキーボード入力を可能にする
        Scanner scanner = new Scanner(System.in);
        
        // コンソールにメッセージを表示し、ユーザーに名前の入力を求める
        System.out.print("名前を入力してください：");
        
        // 入力された名前を変数に格納
        String name = scanner.nextLine();

        // 入力された名前を基にキャラクターのステータスをセットするオブジェクトを作成
        SetCharacterData setData = new SetCharacterData(name);
        
        // キャラクターのステータスを取得するオブジェクトを作成
        GetCharacterData getData = new GetCharacterData(setData);

        // キャラクターの名前とステータスをコンソールに出力
        System.out.println("こんにちは " + getData.getName() + " さん");
        System.out.println("ステータス");
        System.out.println("HP：" + getData.getHp());
        System.out.println("MP：" + getData.getMp());
        System.out.println("攻撃力：" + getData.getAttack());
        System.out.println("素早さ：" + getData.getSpeed());
        System.out.println("防御力：" + getData.getDefense());
        
        // 冒険の開始メッセージを表示
        System.out.println("\nさあ冒険に出かけよう！");

        // Scannerオブジェクトを閉じる
        scanner.close();
    }
}
