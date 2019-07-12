package org.dimigo.OpenAPI;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class webCrawler_moonyeong {
    public static void main(String[] args) {
        String addedurl = "";
        // 네이버 웹툰
        try {
            Document doc = Jsoup.connect("http://doc.samsungmobile.com/SM-G8850/TGY/doc.html").get();
            //System.out.println(doc.html());
            Elements result = doc.select("[id=sel_lang_hidden] option");
            List<String> list = result.eachText();
            int i=0;
            for(String s : list)
            {
                if (i>0)
                    break;
                System.out.println(s);
                addedurl = s.substring(6, 36);
                System.out.println(addedurl);
                i++;
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        String newurl = "";
        newurl = "http://doc.samsungmobile.com/" + addedurl;
        try {
            Document doc = Jsoup.connect(newurl).get();
            Elements result = doc.select("[id=iframe_ctx]");
            Elements result2 = doc.select("[class=\"container\"] div span");
            List<String> list = result.eachText();
            List<String> list2 = result2.eachText();
            int i = 0;
            for (String s : list) {
                i++;
                System.out.println(s);
                if (i > 3) {
                    break;
                }
            }
            int j = 0;
            for (String s : list2) {
                j++;
                System.out.println(s);
                if (j > 1) {
                    break;
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
