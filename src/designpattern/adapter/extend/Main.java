package designpattern.adapter.extend;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("other.Hello");
        p.printWeak();
        p.printStrong();
    }
}
