package sort;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import prefecture.Prefecture;

// このクラスは都道府県のリストを特定の基準でソートするためのロジックを提供します。
public class SortLogic {
    
    /*
     * 選択された都道府県のインデックスに基づいて、都道府県を面積でソートするメソッド。
     * @param prefectures 全都道府県のリスト
     * @param indices ソート対象となる都道府県のインデックスのリスト
     * @param ascending 昇順でソートする場合はtrue、降順の場合はfalse
     * @return ソートされた都道府県のリスト
     */
    public static List<Prefecture> sortPrefecturesByArea(List<Prefecture> prefectures, List<Integer> indices, boolean ascending) {
        
        // 面積を比較するためのComparatorを定義
        // 匿名内部クラスを使用して昇順・降順の比較ロジックを定義
        Comparator<Prefecture> comparator = new Comparator<Prefecture>() {
           
            public int compare(Prefecture p1, Prefecture p2) {
                if (ascending) {
                    // 昇順の場合は面積が小さい順にソート
                    return Double.compare(p1.getArea(), p2.getArea());
                } else {
                    // 降順の場合は面積が大きい順にソート
                    return Double.compare(p2.getArea(), p1.getArea());
                }
            }
        };
        
        // StreamAPIを使用して以下の処理を行う
        return indices.stream()
                      // indicesの各要素（都道府県のインデックス）に基づいて、実際の都道府県オブジェクトを取得する
                      .map(prefectures::get)
                      
                      // 定義したcomparatorを使用して都道府県をソート
                      .sorted(comparator)
                      
                      // ソートされた都道府県のリストを生成する
                      .collect(Collectors.toList());
    }
}
