package characterPackage;

public class GetCharacterData extends SetCharacterData {
    
    // SetCharacterDataオブジェクトを引数に取るコンストラクタ
    public GetCharacterData(SetCharacterData setData) {
        super(setData.getName());

        // SetCharacterDataオブジェクトからデータをコピー
        this.name = setData.getName();
        this.hp = setData.getHp();
        this.mp = setData.getMp();
        this.attack = setData.getAttack();
        this.speed = setData.getSpeed();
        this.defense = setData.getDefense();
    }
}
