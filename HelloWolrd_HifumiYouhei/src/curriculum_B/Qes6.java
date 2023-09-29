package curriculum_B;

import java.util.Random;  // 乱数を生成するためのクラスをインポート
import java.util.Scanner; // ユーザーからの入力を受け付けるためのクラスをインポート

public class Qes6 {

    public static void main(String[] args) {
        
        // Scannerクラスのインスタンスを生成。これにより、ユーザーからの入力を受け付けられるようになる。
        Scanner scanner = new Scanner(System.in);

        // ユーザーに商品名の入力を促すメッセージを表示
        System.out.print("商品を「、」区切りで入力してください: ");
        
        // ユーザーからの入力を文字列として受け取る
        String input = scanner.nextLine();

        // 「、」で区切られた文字列を配列に変換する。例: "テレビ、パソコン" -> ["テレビ", "パソコン"]
        String[] products = input.split("、");

        // 各商品に対して処理を行う。拡張for文を使用。
        for (String product : products) {
            
            // 0から11までの乱数（ランダムな数字）を生成
            int remaining = new Random().nextInt(12);
            
            // 商品名に応じて異なる処理を行う。switch文を使用。
            switch (product) {
            // テレビまたはディスプレイの場合の処理
            case "テレビ":
            case "ディスプレイ":
                // 11から別のランダムな数を引く処理
                int deducted = new Random().nextInt(12);
                remaining = deducted < remaining ? 11 - deducted : remaining;
                System.out.printf("テレビの残り台数は%d台です%n", remaining);
                break;
            // その他の指定商品の場合、ランダムな残り台数をそのまま表示
            case "パソコン":
            case "冷蔵庫":
            case "扇風機":
            case "洗濯機":
            case "加湿器":
                System.out.printf("%sの残り台数は%d台です%n", product, remaining);
                break;
            // 上記の商品以外が入力された場合、エラーメッセージを表示
            default:
                System.out.printf("『 %s 』は指定の商品ではありません%n", product);
            }
        }
    }
}
