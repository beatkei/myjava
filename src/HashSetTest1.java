import java.util.HashSet;
import java.util.Set;

public class HashSetTest1 {
    public static void main(String[] args) {
        //HashSetは配列の順番を意識しなく重複を許さないリスト
        Set<String> set = new HashSet<>();

        set.add("Alice");
        set.add("Bob");
        set.add("Chris");

        //拡張for文をつかった場合（内部ではイテレータがつかわれている）
        for (String name : set) {
            System.out.println(name);
        }
    }
}
