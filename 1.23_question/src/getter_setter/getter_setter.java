/*
	 	
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 	
	 */
package getter_setter;

public class getter_setter {

	public static void main(String[] args) {
		// Animalクラスのインスタンス（オブジェクト）を作成
		Animal lion = new Animal();

		// ライオンの名前を設定
		lion.setName("ライオン");

		// ライオンの体長を設定
		lion.setLength(2.1);

		// ライオンの速度を設定
		lion.setSpeed(80);

		// ライオンの名前を出力
		System.out.println("動物名：" + lion.getName());

		// ライオンの体長を出力
		System.out.println("体長：" + lion.getLength() + "m");

		// ライオンの速度を出力
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}

}

// Animalという名前のクラスを作成
class Animal {
	// 動物の名前のためのフィールド
	private String name;

	// 動物の体長のためのフィールド
	private double length;

	// 動物の速度のためのフィールド
	private int speed;

	// 名前を取得するメソッド
	public String getName() {
		return name;
	}

	// 名前を設定するメソッド
	public void setName(String name) {
		// thisを使って、フィールドのnameとメソッドのパラメータnameを区別する
		this.name = name;
	}

	// 体長を取得するメソッド
	public double getLength() {
		return length;
	}

	// 体長を設定するメソッド
	public void setLength(double length) {
		// thisを使って、フィールドのlengthとメソッドのパラメータlengthを区別する
		this.length = length;
	}

	// 速度を取得するメソッド
	public int getSpeed() {
		return speed;
	}

	// 速度を設定するメソッド
	public void setSpeed(int speed) {
		// thisを使って、フィールドのspeedとメソッドのパラメータspeedを区別する
		this.speed = speed;
	}
}
