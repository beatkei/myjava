package other;

public class ProducerConsumer {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        Producer producer1 = new Producer(queue);
        Producer producer2 = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        producer1.start();
        producer2.start(); //producer1のput()でsynchrinizedしているがwaitはロックを解放しているので動ける
        consumer.start();
    }
}

class MyQueue {
    int[] intbuf;
    int start;
    int count;
    public MyQueue(int size) {
        intbuf = new int[size];
        start = 0;
        count = 0;
    }
    public synchronized void put(int n) throws InterruptedException {
        while (count >= intbuf.length) { //wait再開後にwhileの中で再開されれば条件が再評価される（if文だとダメ）
            System.out.println(Thread.currentThread().getName() + " wait : バッファの空きを待つ");
            wait();
        }
        int end = (start + count) % intbuf.length;
        intbuf[end] = n;
        count++;
        notifyAll(); // waitしたメソッドが再開される
    }
    public synchronized int take() throws InterruptedException {
        while (count == 0) {
            System.out.println(Thread.currentThread().getName() + " wait : データを待つ");
            wait();
        }
        int n = intbuf[start];
        start = (start + 1) % intbuf.length;
        count--;
        notifyAll();
        return n;
    }
}

class Producer extends Thread {
    static final int END = -1;
    MyQueue queue = null;
    Producer(MyQueue queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                int n = produce(i);
                queue.put(n);
            }
            queue.put(Producer.END);
        } catch (InterruptedException e) {
        }
    }
    int produce(int n) {
        // producer の複数スレドッド検証のためコメントアウト
        //sleepRandomly();
        System.out.println("other.Producer:" + getName() + "は " + n + " を生産完了");
        return n;
    }
    void sleepRandomly() {
        try {
            int n = (int)(Math.random() * 1000);
            Thread.sleep(n);
        } catch (InterruptedException e) {
        }
    }
}

class Consumer extends Thread {
    MyQueue queue = null;
    Consumer(MyQueue queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            while (true) {
                int n = queue.take();
                if (n == Producer.END) {
                    break;
                }
                consume(n);
            }
        } catch (InterruptedException e) {
        }
    }
    void consume(int n) {
        System.out.println("other.Consumer:" + getName() + "は " + n + " を消費中");
        sleepRandomly();
    }
    void sleepRandomly() {
        try {
            int n = (int)(Math.random() * 1000);
            Thread.sleep(n);
        } catch (InterruptedException e) {
        }
    }
}
