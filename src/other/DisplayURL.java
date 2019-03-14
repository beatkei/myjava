package other;

import sun.net.www.protocol.mailto.MailToURLConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class DisplayURL {
    public static void main(String[] args) {
        BufferedReader readerArgs = new BufferedReader(new InputStreamReader(System.in));
        try {
            String lineURL;
            lineURL = readerArgs.readLine();
            System.out.println("URL = " + lineURL);
            URL url = new URL("http://" + lineURL);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
            reader.close();
        } catch (MalformedURLException e) {
            System.out.println("URLの形式がまちがっています" + e);
        } catch (IOException e) {
            System.out.println("I/Oエラーです" + e);
        }
    }

}
