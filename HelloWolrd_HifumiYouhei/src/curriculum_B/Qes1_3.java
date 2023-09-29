package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	
	public static void main(String[] args) {
		String name = inputUserName(); // 問１：ユーザー名の入力
		validateUserName(name);       // 問２：ユーザー名の検証

		// ユーザー名が正常である場合、じゃんけんゲームを開始
		if (name != null && !name.isEmpty() && name.matches("^[a-zA-Z0-9]+$") && name.length() <= 10) {
			playJanken(name); // 問３：じゃんけんゲーム
		}
	}

	// 問１：ユーザー名を入力するメソッド
	public static String inputUserName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ユーザー名を入力してください: "); // ユーザーにユーザー名の入力を促す
		return sc.nextLine();
	}

	// 問２：入力されたユーザー名を検証するメソッド
	public static void validateUserName(String name) {
		if (name == null || name.isEmpty()) { // ユーザー名がnullまたは空の場合のチェック
			System.out.println("名前を入力してください");
			return;
		}
		
		if (name.length() > 10) { // ユーザー名が10文字より多い場合のチェック
			System.out.println("名前を10文字以内にしてください");
			return;
		}
		
		if (!name.matches("^[a-zA-Z0-9]+$")) { // ユーザー名が半角英数字でない場合のチェック
			System.out.println("半角英数字のみで名前を入力してください");
			return;
		}

		System.out.println("ユーザー名「" + name + "」を登録しました");
	}

	// 問３：じゃんけんゲーム
	public static void playJanken(String name) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); // ランダムな数値を生成するためのツール
		int count = 0; // じゃんけんのプレイ回数をカウント
		
		

		while (true) { // 勝つまでループ
			System.out.println("0: グー, 1: チョキ, 2: パー");
			System.out.print("手を選んでください: ");
			int userChoice = sc.nextInt();
			int opponentChoice = rand.nextInt(3); // 0から2までの乱数を生成
			
			// 両者の手を表示
			System.out.println(name + "の手は「" + handName(userChoice) + "」");
			System.out.println("相手の手は「" + handName(opponentChoice) + "」");

			// 勝敗判定
			if (userChoice == opponentChoice) {
				System.out.println("DRAW あいこ もう一回しましょう！");
			} else if ((userChoice == 0 && opponentChoice == 1) || (userChoice == 1 && opponentChoice == 2) || (userChoice == 2 && opponentChoice == 0)) {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				break;
			} else {
				System.out.println("俺の勝ち！");
				loseMessage(opponentChoice); // 負けた時のメッセージを表示
			}
			count++; // プレイ回数を1増やす
		}
		// じゃんけんを行った回数を表示
		System.out.println("勝つまでにかかった合計回数は" + (count + 1) + "回です");
	}

	// 手の名前を返すメソッド
	public static String handName(int choice) {
		switch (choice) {
			case 0: return "グー";
			case 1: return "チョキ";
			case 2: return "パー";
			default: return "";
		}
	}

	// ユーザーが負けたときのメッセージを表示するメソッド
	public static void loseMessage(int opponentChoice) {
		switch (opponentChoice) {
			case 0:
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
				break;
			case 1:
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
				break;
			case 2:
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
				break;
		}
	}
}
