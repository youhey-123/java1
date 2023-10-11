package characterPackage;

public class GetCharacterData extends SetCharacterData {
    // コンストラクタ: SetCharacterDataからキャラクターステータスを受け取り
    public GetCharacterData(SetCharacterData setData) {
        super(setData.getName()); 
    }
}
