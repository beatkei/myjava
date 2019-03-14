package designpattern.adapter.transfer;

import designpattern.adapter.extend.Print;
import designpattern.adapter.extend.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
