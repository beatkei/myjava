import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class LinkedListTest1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");

        System.out.println(list);

        //拡張for文をつかった場合（内部ではイテレータがつかわれている）
        for (String name : list) {
            System.out.println(name);
        }

        //LinkedListをキューとして利用する場合はQueueインターフェスを利用
        Queue<String> queue = list;

        //offer(),peek(),poll()はキューがからだったらnullで返却されるメソッド
        queue.offer("Diana");

        while (queue.peek() != null) {
            String name = queue.poll();
            System.out.println(name);
        }

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");

        //element(),remove()はキューが空だったらExceptionをthrowする
        try {
            while (true) {
                String name = queue.element();
                name = queue.remove();
                System.out.println(name);
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }


    }

}
