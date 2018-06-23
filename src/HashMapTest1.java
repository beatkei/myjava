import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Alice", 100);
        map.put("Bob", 57);
        map.put("Chris", 85);
        map.put("Diana", 85);

        //エントリ（key+Value）を利用した拡張forループ
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }

        System.out.println();

        //keyを利用した拡張forループ
        for (String name : map.keySet()) {
            System.out.println(name);
        }

        System.out.println();

        //valueを利用した拡張forループ
        for (int value : map.values()) {
            System.out.println(value);
        }

        System.out.println();

        //keyを利用した拡張forループで値も得る
        for (String name : map.keySet()) {
            System.out.println(name + "=>" + map.get(name));
        }

        System.out.println();

        //keyがBobの値を得る
        System.out.println(map.get("Bob"));
    }
}
