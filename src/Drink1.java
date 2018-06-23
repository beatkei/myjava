import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物はすきですか？");
            System.out.println("１　オレンジジューズ");
            System.out.println("２　コーヒー");
            System.out.println("３　どちらでもない");
            System.out.println("１、２、３のどれかを選んでください");
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            switch (n) {
                case 1:
                    System.out.println("オレンジジューズです。");
                    break;

                case 2:
                    System.out.println("コーヒです。");
                    break;

                default:
                    System.out.println("どちらでもありません");
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}
