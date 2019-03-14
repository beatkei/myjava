package other;

import static java.lang.System.out; // staticフィールドのインポート
import static java.lang.Math.max; // staticメソッドのインポート

//import static java.lang.System.*; // staticフィールドとメソッドのインポート
//import static java.lang.Math.*; // staticフィールドとメソッドのインポート

public class Max {
    public static void main(String[] args) {
        int x = 45;
        int y = 100;
        int z = max(x, y);
        out.println("z = " + z);
    }
}
