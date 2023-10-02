package curriculum_B;

import java.util.Scanner;

public class Qes7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 生徒の人数を入力するためのプロンプト
        System.out.print("生徒の人数を入力してください（2以上）: ");
        int studentsCount = scanner.nextInt();

        // 2人以上の生徒数が入力されるまでループ
        while (studentsCount < 2) {
            System.out.println("2以上の数を入力してください。");
            System.out.print("生徒の人数を入力してください（2以上）: ");
            studentsCount = scanner.nextInt();
        }

        // 各生徒の各科目のスコアを保存する二次元配列
        double[][] scores = new double[studentsCount][4];
        
        // 科目名の配列
        String[] subjects = { "英語", "数学", "理科", "社会" };
        
        // 各科目の合計スコアを保存する配列
        double[] subjectTotal = new double[4];

        // 生徒ごとに科目のスコアを入力する
        for (int i = 0; i < studentsCount; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d人目の『%s』の点数を入力してください :", i + 1, subjects[j]);
                scores[i][j] = scanner.nextDouble();
                
                // 各科目の合計スコアを更新
                subjectTotal[j] += scores[i][j];
            }
            System.out.println();
        }

        // 全生徒の平均スコアの合計を保存する変数
        double totalAverage = 0;
        
        // 各生徒の平均スコアを計算して出力する
        for (int i = 0; i < studentsCount; i++) {
            double studentAverage = 0;
            for (int j = 0; j < 4; j++) {
                studentAverage += scores[i][j];
            }
            studentAverage /= 4;
            totalAverage += studentAverage;
            System.out.printf("%d人目の平均点は%.2f点です。%n", i + 1, studentAverage);
        }
        System.out.println();

        // 各科目の平均スコアを計算して出力する
        for (int j = 0; j < 4; j++) {
            System.out.printf("%sの平均点は%.2f点です。%n", subjects[j], subjectTotal[j] / studentsCount);
        }

        // 全体の平均スコアを計算して出力する
        totalAverage /= studentsCount;
        System.out.printf("全体の平均点は%.2f点です。", totalAverage);
        
        // Scannerを閉じる
        scanner.close();
    }
}
