package LJH_Project2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int firstchoice = 0;
            int input = 0;
            String model = "";
            int carrier = 0;
            String csc = "";
            String model_final = "";
            String url = "";
            Scanner scan = new Scanner(System.in);
            System.out.println();
            System.out.println("---------- 삼성 갤럭시 소프트웨어 정보 ----------");
            System.out.println();
            System.out.println("1. 펫네임 입력 (예 : S7)   2. 모델명 입력 (예 : SM-G930K)");
            System.out.printf("선택 : ");
            firstchoice = scan.nextInt();
            if (firstchoice == 1) {
                System.out.println();
                System.out.printf("펫네임 입력 : ");
                model = scan.next();
                System.out.println("기기 통신사 선택");
                System.out.println("1. SKT   2. KT   3. LG U+   4. 자급제");
                System.out.printf("선택 : ");
                carrier = scan.nextInt();
                if (model.contains("s6")) {
                    if (carrier == 1) {
                        model_final = "SM-G920S";
                    }
                    else if (carrier == 2) {
                        model_final = "SM-G920K";
                    }
                    else if (carrier == 3) {
                        model_final = "SM-G920L";

                    }
                } else if (model.contains("s7")) {
                    if (carrier == 1) {
                        model_final = "SM-G930S";

                    }
                    else if (carrier == 2) {
                        model_final = "SM-G930K";
                    }
                    else if (carrier == 3) {
                        model_final = "SM-G930L";
                    }
                } else if (model.contains("s8")) {
                    if (carrier == 1) {
                        model_final = "SM-G950N";
                        csc = "SKC";
                    } else if (carrier == 2) {
                        model_final = "SM-G950N";
                        csc = "KTC";
                    } else if (carrier == 3) {
                        model_final = "SM-G950N";
                        csc = "LUC";
                    }
                } else if (model.contains("s8 plus") || model.contains("s8+") || model.contains("s8 플러스")) {
                    if (carrier == 1) {
                        model_final = "SM-G955N";
                        csc = "SKC";
                    } else if (carrier == 2) {
                        model_final = "SM-G955N";
                        csc = "KTC";
                    } else if (carrier == 3) {
                        model_final = "SM-G955N";
                        csc = "LUC";
                    }
                } else if (model.contains("s9")) {
                    if (carrier == 1) {
                        model_final = "SM-G960N";
                        csc = "SKC";
                    } else if (carrier == 2) {
                        model_final = "SM-G960N";
                        csc = "KTC";
                    } else if (carrier == 3) {
                        model_final = "SM-G960N";
                        csc = "LUC";
                    }
                }
                else if (model.contains("s9 plus") || model.contains("s9+") || model.contains("s9 플러스")) {
                    if (carrier == 1) {
                        model_final = "SM-G965N";
                        csc = "SKC";
                    } else if (carrier == 2) {
                        model_final = "SM-G965N";
                        csc = "KTC";
                    } else if (carrier == 3) {
                        model_final = "SM-G965N";
                        csc = "LUC";
                    }
                }
            } else if (firstchoice == 2) {
                System.out.printf("모델명 입력 (예시 : SM-G930K) : ");
                model_final = scan.next();
                model_final = model_final.toUpperCase();
            } else {
                System.out.println("잘못된 입력입니다.");
            }

            if (model_final == "SM-G920S")
                url = "http://doc.samsungmobile.com/SM-G920S/000008161119/kor.html";
            else if (model_final == "SM-G920K")
                url = "http://doc.samsungmobile.com/SM-G920K/000007161119/kor.html";
            else if (model_final == "SM-G920L")
                url = "http://doc.samsungmobile.com/SM-G920L/000009161119/kor.html";

            else if (model_final == "SM-G930S")
                url = "http://doc.samsungmobile.com/SM-G930S/000002161119/kor.html";
            else if (model_final == "SM-G930K")
                url = "http://doc.samsungmobile.com/SM-G930K/000001161119/kor.html";
            else if (model_final == "SM-G930L")
                url = "http://doc.samsungmobile.com/SM-G930L/000003161119/kor.html";

            else if (model_final == "SM-G950N" && csc == "SKC")
                url = "http://doc.samsungmobile.com/SM-G950N/000008170418/kor.html";
            else if (model_final == "SM-G950N" && csc == "KTC")
                url = "http://doc.samsungmobile.com/SM-G950N/000010170418/kor.html";
            else if (model_final == "SM-G950N" && csc == "LUC")
                url = "http://doc.samsungmobile.com/SM-G950N/000009170418/kor.html";

            else if (model_final == "SM-G955N" && csc == "SKC")
                url = "http://doc.samsungmobile.com/SM-G955N/000013170418/kor.html";
            else if (model_final == "SM-G955N" && csc == "KTC")
                url = "http://doc.samsungmobile.com/SM-G955N/000011170418/kor.html";
            else if (model_final == "SM-G955N" && csc == "LUC")
                url = "http://doc.samsungmobile.com/SM-G955N/000012170418/kor.html";


            System.out.println("1. 모델명/통신사 변경   2. 최신 펌웨어 확인   3. 다운그레이드 가능 여부 확인   4. 남은 OS 업데이트 횟수 확인   5. 종료");
            System.out.println();
            System.out.printf("원하시는 옵션을 선택해 주세요 : ");
            input = scan.nextInt();
            if (input == 2) {
            try {
                Document doc = Jsoup.connect("http://doc.samsungmobile.com/SM-G8850/TGY/doc.html").get();
                //System.out.println(doc.html());
                Elements result = doc.select("[id=iframe_ctx]");
                Elements result2 = doc.select("[class=\"container\"] div span");
                List<String> list = result.eachText();
                List<String> list2 = result2.eachText();
                for (String s : list)
                    System.out.println(s);
                System.out.println("Hello");
                System.out.println();
                System.out.println("---------- 선택한 디바이스 정보 ----------");
                System.out.println("모델명 : " + model_final);
                if (carrier == 1)
                    System.out.println("통신사 : SKT");
                else if (carrier == 2)
                    System.out.println("통신사 : KT");
                else if (carrier == 3)
                    System.out.println("통신사 : LG U+");
                else if (carrier == 4)
                    System.out.println("통신사 : 자급제");

                System.out.println("---------- 최신 소프트웨어 정보 ----------");

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
            } catch (IOException e) {
                System.out.println("잘못된 모델명입니다.");
                e.printStackTrace();
            }
        }
            else if (input == 3)
            {

            }
        }
    }
}