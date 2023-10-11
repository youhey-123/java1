package characterPackage;

import java.util.Random;

public class SetCharacterData {
    // キャラクターの名前と各ステータスのためのフィールド
    protected String name;
    protected int hp;
    protected int mp;
    protected int attack;
    protected int speed;
    protected int defense;

    // ステータスのランダムな値を生成するためのRandomクラスのインスタンス
    private Random random = new Random();

    public SetCharacterData(String name) {
        // 名前をフィールドにセット
        setName(name);

        // 各ステータスを1から1000の範囲でランダムにセット
        setHp(random.nextInt(1000) + 1);
        setMp(random.nextInt(1000) + 1);
        setAttack(random.nextInt(1000) + 1);
        setSpeed(random.nextInt(1000) + 1);
        setDefense(random.nextInt(1000) + 1);
    }

    // 名前のゲッター
    public String getName() {
        return name;
    }

    // 名前のセッター
    public void setName(String name) {
        this.name = name;
    }

    // 以下、各ステータスのゲッターとセッター
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
