package curriculum_B;

import java.util.Random;  // 乱数を生成するためのライブラリを利用
import java.util.Scanner;  // ユーザーの入力を読み取るためのライブラリを利用

public class Qes6 {

    public static void main(String[] args) {

        // 「Scanner」という変数タイプを使って、キーボードからの入力を受け取る準備をする
        Scanner scanner = new Scanner(System.in);

        // ユーザーにメッセージを表示
        System.out.print("商品を「、」区切りで入力してください: ");
        
        // ユーザーが入力した情報を「input」という名前の変数に保存する
        String input = scanner.nextLine();
        
        // 入力した商品名を「、」で区切り、それを「products」という配列に格納する
        String[] products = input.split("、");

        // テレビの在庫数をランダムに生成し、「remainingForTV」という変数に保存
        int remainingForTV = new Random().nextInt(12);
        
        // ディスプレイの在庫数は11からテレビの在庫数を引いたものを計算し、「remainingForDisplay」という変数に保存
        int remainingForDisplay = 11 - remainingForTV;

        // 入力された各商品名に対して、処理を繰り返し行う
        for (String product : products) {

            // 商品名によって処理を分岐
            switch (product) {

                case "テレビ":
                    System.out.printf("テレビの残り台数は%d台です%n", remainingForTV);
                    break;

                case "ディスプレイ":
                    System.out.printf("ディスプレイの残り台数は%d台です%n", remainingForDisplay);
                    break;
                    
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    int remaining = new Random().nextInt(12);  // この商品の残り在庫をランダムに生成
                    System.out.printf("%sの残り台数は%d台です%n", product, remaining);
                    break;

                default:
                    System.out.printf("『 %s 』は指定の商品ではありません%n", product);
            }
        }

        // 入力の受付を終了
        scanner.close();
    }
}
