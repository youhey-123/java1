package mainPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import prefecture.Prefecture;
import sort.SortLogic;

public class Main {

	public static void main(String[] args) {
		// 初期化: 都道府県データのリストを作成
		List<Prefecture> prefectures = Arrays.asList(
				new Prefecture("北海道", "札幌市", 83424.0),
				new Prefecture("青森県", "青森市", 9646.0),
				new Prefecture("岩手県", "盛岡市", 15275.0),
				new Prefecture("宮城県", "仙台市", 7282.0),
				new Prefecture("秋田県", "秋田市", 11638.0),
				new Prefecture("山形県", "山形市", 9323.0),
				new Prefecture("福島県", "福島市", 13784.0),
				new Prefecture("茨城県", "水戸市", 6097.0),
				new Prefecture("栃木県", "宇都宮市", 6408.0),
				new Prefecture("群馬県", "前橋市", 6362.0),
				new Prefecture("埼玉県", "さいたま市", 3798.0));

		// キーボード入力の準備
		Scanner scanner = new Scanner(System.in);

		// ユーザーから選択した都道府県のインデックスを受け取るためのリスト
		List<Integer> indices = new ArrayList<>();

		// ユーザーが有効な都道府県のインデックスを入力するまで繰り返す
		while (true) {
			System.out.println("数字をカンマ区切りで入力してください:");
			try {
				// 入力されたテキストをカンマで分割し、整数のリストとして取得
				indices = Arrays.stream(scanner.nextLine().split(","))
						.map(Integer::parseInt)
						.collect(Collectors.toList());

				// 入力されたインデックスの値が有効か（存在する都道府県のインデックスか）確認
				boolean allIndicesValid = indices.stream().allMatch(index -> index >= 0 && index < prefectures.size());

				// 有効なインデックスがすべて入力された場合、ループを抜ける
				if (allIndicesValid) {
					break;
				}

			} catch (NumberFormatException e) {
				// 数字以外の文字や不正な文字が入力された場合に捕捉
				// 何もしない
			}

			// 不正な入力（整数でない入力や範囲外の入力）があった場合のメッセージを表示
			System.out.println("無効な選択です。再度入力してください。");
		}

		// 昇順か降順かをユーザーに選択させる
		int orderChoice = 0;
		while (true) {
			System.out.println("昇順なら1、降順なら2を入力してください:");
			try {
				orderChoice = Integer.parseInt(scanner.nextLine());
				// 1または2が選択された場合、ループを抜ける
				if (orderChoice == 1 || orderChoice == 2) {
					break;
				}
			} catch (NumberFormatException e) {
				// 数字以外の文字が入力された場合に捕捉
				// 何もしない
			}
			System.out.println("無効な選択です。再度入力してください。");
		}

		// 昇順か降順かのフラグを設定 (true: 昇順, false: 降順)
		boolean ascending = orderChoice == 1;

		// 選択された都道府県を面積でソート
		List<Prefecture> sortedPrefectures = SortLogic.sortPrefecturesByArea(prefectures, indices, ascending);

		// ソート結果をコンソールに出力
		for (Prefecture prefecture : sortedPrefectures) {
			System.out.println("都道府県名：" + prefecture.getName());
			System.out.println("県庁所在地：" + prefecture.getCapital());
			System.out.println("面積：" + prefecture.getArea() + "km2\n");
		}

		// キーボード入力を終了
		scanner.close();
	}
}
