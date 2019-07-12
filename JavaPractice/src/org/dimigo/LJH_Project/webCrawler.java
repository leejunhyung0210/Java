package org.dimigo.LJH_Project;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class webCrawler {
    public static void main(String[] args) {
        // 클리앙
        try {
            Document doc = Jsoup.connect("https://www.clien.net/service/board/jirum").get();
            //System.out.println(doc.html());
            Elements result = doc.select("[class=list_title] span a");
            List<String> list = result.eachText();
            for(String s : list)
            {
                    //System.out.println(s);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        // 뽐뿌
        try {
            Document doc = Jsoup.connect("http://www.ppomppu.co.kr/zboard/zboard.php?id=ppomppu4").get();
            //System.out.println(doc.html());
            Elements result = doc.select("[valign=\"middle\"] a");
            List<String> list = result.eachText();
            for(String s : list)
            {
                //System.out.println(s);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        // 퀘이사존
        try {
            Document doc = Jsoup.connect("https://quasarzone.co.kr/bbs/board.php?bo_table=qb_saleinfo").get();
            //System.out.println(doc.html());
            Elements result = doc.select("[class=\"list-item\"] div a.item-subject span wr-icon wr-hot");
            List<String> list = result.eachText();
            for(String s : list)
            {
                System.out.println(s);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
