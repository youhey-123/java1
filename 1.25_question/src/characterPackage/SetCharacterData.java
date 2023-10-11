package characterPackage;

import java.util.Random;

public class SetCharacterData {
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int speed;
    private int defense;
    
    // Randomインスタンスを生成してランダムな数値を作成するために使用
    private Random random = new Random();

    // コンストラクタ: 名前を受け取り、それに基づいてキャラクターステータスをランダムにセット
    public SetCharacterData(String name) {
        this.name = name; 
        this.hp = random.nextInt(1000) + 1;
        this.mp = random.nextInt(1000) + 1;
        this.attack = random.nextInt(1000) + 1;
        this.speed = random.nextInt(1000) + 1;
        this.defense = random.nextInt(1000) + 1;
    }

    // 名前を返すゲッターメソッド
    public String getName() {
        return name;
    }

    // 以下、各ステータス値を取得するゲッターメソッド
    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDefense() {
        return defense;
    }
}
