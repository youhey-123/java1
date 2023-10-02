package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// 全体のScannerオブジェクトを生成
		Scanner sc = new Scanner(System.in);

		// 問１：ユーザー名の入力
		String name = inputUserName(sc);

		// 問２：ユーザー名の妥当性チェック
		validateUserName(name);

		// ユーザー名の条件チェック
		if (name != null && !name.isEmpty() && name.matches("^[a-zA-Z0-9]+$") && name.length() <= 10) {
			// 問３：じゃんけんゲーム開始
			playJanken(name, sc);
		}

		// Scannerを閉じる
		sc.close();
	}

	// 問１：ユーザー名を入力するメソッド
	public static String inputUserName(Scanner sc) {
		// ユーザーからの名前入力を促す
		System.out.print("ユーザー名を入力してください: ");

		// 入力されたユーザー名を取得
		String name = sc.nextLine();

		return name;
	}

	// 問２：入力されたユーザー名を検証するメソッド
	public static void validateUserName(String name) {
		// ユーザー名がnullまたは空の場合のチェック
		if (name == null || name.isEmpty()) {
			System.out.println("名前を入力してください");
			return;
		}

		// ユーザー名が10文字より多い場合のチェック
		if (name.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
			return;
		}

		// ユーザー名が半角英数字でない場合のチェック
		if (!name.matches("^[a-zA-Z0-9]+$")) {
			System.out.println("半角英数字のみで名前を入力してください");
			return;
		}

		// ユーザー名の登録メッセージ
		System.out.println("ユーザー名「" + name + "」を登録しました");
	}

	// 問３：じゃんけんゲーム
	public static void playJanken(String name, Scanner sc) {
		// ランダムな数値を生成するためのツール
		Random rand = new Random();

		// じゃんけんのプレイ回数をカウント
		int count = 0;

		// 勝つまでループ
		while (true) {
			// ユーザーに手の選択を促す
			System.out.println("0: グー, 1: チョキ, 2: パー");
			System.out.print("手を選んでください: ");

			// ユーザーの手を取得
			int userChoice = sc.nextInt();

			// コンピュータの手をランダムに選択
			int opponentChoice = rand.nextInt(3);

			// 選んだ手の表示
			System.out.println(name + "の手は「" + handName(userChoice) + "」");
			System.out.println("相手の手は「" + handName(opponentChoice) + "」");

			// 勝敗の判定とメッセージ表示
			if (userChoice == opponentChoice) {
				System.out.println("DRAW あいこ もう一回しましょう！");
			} else if ((userChoice == 0 && opponentChoice == 1) || (userChoice == 1 && opponentChoice == 2)
					|| (userChoice == 2 && opponentChoice == 0)) {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				break;
			} else {
				System.out.println("俺の勝ち！");
				loseMessage(opponentChoice);
			}

			// プレイ回数を1増やす
			count++;
		}

		// 合計じゃんけん回数の表示
		System.out.println("勝つまでにかかった合計回数は" + (count + 1) + "回です");
	}

	// 手の名前を返すメソッド
	public static String handName(int choice) {
		// 手の番号から名称を取得
		switch (choice) {
		case 0:
			return "グー";
		case 1:
			return "チョキ";
		case 2:
			return "パー";
		default:
			return "";
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
