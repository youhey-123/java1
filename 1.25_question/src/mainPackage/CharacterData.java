package mainPackage;

import java.util.Scanner;

import characterPackage.GetCharacterData;
import characterPackage.SetCharacterData;

public class CharacterData {
    public static void main(String[] args) {
        // キーボード入力のためのScannerインスタンスの作成
        Scanner scanner = new Scanner(System.in);

        // ユーザーに名前の入力を促すメッセージの表示
        System.out.print("名前を入力してください：");

        // ユーザーからの入力を受け取り、変数nameに格納
        String name = scanner.nextLine();

        // ユーザーの入力に基づいてキャラクターのステータスを設定
        SetCharacterData setData = new SetCharacterData(name);

        // キャラクターステータスを取得するためのインスタンスを作成
        GetCharacterData getData = new GetCharacterData(setData);

        // キャラクターの名前とステータスを出力
        System.out.println("こんにちは " + getData.getName() + " さん");
        System.out.println("ステータス");
        System.out.println("HP：" + getData.getHp());
        System.out.println("MP：" + getData.getMp());
        System.out.println("攻撃力：" + getData.getAttack());
        System.out.println("素早さ：" + getData.getSpeed());
        System.out.println("防御力：" + getData.getDefense());

        // 冒険開始のメッセージを出力
        System.out.println("\nさあ冒険に出かけよう！");

        // Scannerのリソースを解放
        scanner.close();
    }
}
