package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 001から009までの掛け算を行うための外側のループ
		for (int i = 1; i <= 9; i++) {

			// 001から009までの掛け算を行うための内側のループ
			for (int j = 1; j <= 9; j++) {

				// 書式付きで掛け算の結果を表示。例: "001 × 001 = 001"
				System.out.printf("%03d * %03d = %03d", j, i, i * j);

				// jが9でない場合（最後の列でない場合）、区切り文字" || "を表示
				if (j != 9) {
					System.out.print(" || ");
				}
			}

			// 一つの段が終わったら改行を入れて、次の段の表示に備える。
			System.out.println();
		}
	}

}
