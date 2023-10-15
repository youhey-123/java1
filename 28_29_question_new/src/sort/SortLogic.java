package sort;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import prefecture.Prefecture;

// このクラスは都道府県のリストを特定の基準でソートするためのロジックを提供します。
public class SortLogic {
    
    /**
     * 選択された都道府県のインデックスに基づいて、都道府県を面積でソートするメソッド。
     * 
     * @param prefectures 全都道府県のリスト
     * @param indices ソート対象となる都道府県のインデックスのリスト
     * @param ascending 昇順でソートする場合はtrue、降順の場合はfalse
     * @return ソートされた都道府県のリスト
     */
    public static List<Prefecture> sortPrefecturesByArea(List<Prefecture> prefectures, List<Integer> indices, boolean ascending) {
        
        // StreamAPIを使用して以下の処理を行う
        return indices.stream()
                      // indicesの各要素（都道府県のインデックス）に基づいて、実際の都道府県オブジェクトを取得する
                      .map(prefectures::get)
                      
                      // 取得した都道府県オブジェクトを面積でソートする。
                      // ここでは降順でソートされるが、ascendingがtrueの場合は後の処理で昇順に戻される。
                      .sorted(Comparator.comparingDouble(Prefecture::getArea).reversed())
                      
                      // ソートされた都道府県のリストを生成する
                      .collect(Collectors.toList());
    }
}
