package designpattern.adapter.transfer;

import designpattern.adapter.extend.Banner;

public class PrintBanner extends designpattern.adapter.transfer.Print {
    private Banner banner;
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
