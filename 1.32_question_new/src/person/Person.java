package person;

public class Person {
    public static int count = 0;
    public String firstName; 
    
    // 問題1: 姓を保持するインスタンスフィールドを追加
    public String lastName;    
    public int age;
    public double height, weight;

    // 問題2: コンストラクタをオーバーロードして、姓も受け取る新しいコンストラクタを追加
    public Person(String firstName, String lastName, int age, double height, double weight) {
        Person.count++;        
        this.firstName = firstName;
        
        // 問題3: コンストラクタで受け取った姓をフィールドにセット
        this.lastName = lastName; 
        
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String fullName() {
        return this.firstName + " " + this.lastName; // 空白を追加して名前と姓の間を空ける
    }

    public void print() {
        System.out.println("名前は" + this.fullName() + "です");
        System.out.println("年は" + this.age + "歳です");
    }

    public double bmi() {
        return this.weight / this.height / this.height;
    }

    public static void printCount() { 
        System.out.println("合計" + Person.count + "人です");
    }
}
