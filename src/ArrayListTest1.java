import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest1 {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<String>();
        //newするときジェネリクスの型は型推論によりダイヤモンド型<>として省略できる
        ArrayList<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");

        list.remove("Alice");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //イテレータをつかった場合
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String name = it.next();
            System.out.println(name);
        }

        //拡張for文をつかった場合（内部ではイテレータがつかわれている）
        for (String name : list) {
            System.out.println(name);
        }
    }
}
