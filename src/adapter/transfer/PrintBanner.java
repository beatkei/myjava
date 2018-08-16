package adapter2;

import adapter.Banner;
import adapter.Print;

public class PrintBanner extends adapter2.Print {
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
