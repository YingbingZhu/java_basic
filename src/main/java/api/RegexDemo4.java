package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) throws IOException {
        // URL url = new URL("https://m.sengzan.com/jiaoyu/29104.html?ivk_sa=1025883i");
        URL url = new URL("https://www.usnews.com/best-graduate-schools/top-science-schools/computer-science-rankings");
        URLConnection conn = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        // regex pattern

        String regex = "[1-9]//d{17}";
        Pattern p = Pattern.compile(regex);
        while ((line = br.readLine()) != null) {
            Matcher matcher = p.matcher(line);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        br.close();

    }
}
