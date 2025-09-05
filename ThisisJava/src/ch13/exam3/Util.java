package ch13.exam3;

public class Util {
    // note: Key 값을 확인하여 Value를 리턴해야 하기에
    //  <K, V> V 에서 <K, V> K가 아닌 V를 입력해야함 -> 반환값이 V이기 때문
    public static <K, V> V getValue(Pair<K, V> pair, K key){
        if(pair.getKey().equals(key)){
            return pair.getValue();
        }
        return null;

    }
}
