package prefecture;

// このクラスは都道府県に関する情報を表します。
public class Prefecture {
    // 都道府県の名前
    private String name;
    
    // 県庁所在地
    private String capital;
    
    // 面積
    private double area;

    
    // このメソッドを使って、都道府県の名前、県庁所在地、面積を設定
    public Prefecture(String name, String capital, double area) {
    	
        this.name = name;       // 都道府県の名前を設定
        this.capital = capital; // 県庁所在地を設定
        this.area = area;       // 面積を設定
    }

    // 都道府県の名前を返すメソッド
    public String getName() {
        return name;
    }

    // 都道府県の県庁所在地を返すメソッド
    public String getCapital() {
        return capital;
    }

    // 都道府県の面積を返すメソッド
    public double getArea() {
        return area;
    }
}
