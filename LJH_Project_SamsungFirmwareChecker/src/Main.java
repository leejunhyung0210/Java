import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            while (true) {
                int buildfound = 0;
                int input = 0;
                int error = 0;
                int firsterror = 0;
                List<String> list = null;
                List<String> list1 = null;
                List<String> list2 = null;
                List<String> list3 = null;
                int carrier = 0;
                String csc = "";
                String model_final = "";
                String url = "";
                String urlfinal = "";
                String checkbuild = "";
                String addedurl = "";
                String checkcsc = "";
                String latest_build_number = "";
                String user_build_number = "";
                int num_latest_build_number=0;
                int num_user_build_number=0;
                Scanner scan = new Scanner(System.in);
                System.out.println();
                System.out.println("---------- 삼성 갤럭시 소프트웨어 정보 ----------");
                System.out.println();
                    System.out.printf("모델명 입력 (예시 : SM-G930K) : ");
                    model_final = scan.next();
                    model_final = model_final.toUpperCase();
                    try {
                        checkcsc = model_final.substring(7);
                    } catch (StringIndexOutOfBoundsException s) {
                        System.err.println("모델명을 잘못 입력하셨습니다.");
                        firsterror = 1;
                    }
                    if (checkcsc.equals("S"))
                        csc = "SKC";
                    else if (checkcsc.equals("K"))
                        csc = "KTC";
                    else if (checkcsc.equals("L"))
                        csc = "LUC";
                    else if (checkcsc.equals("N")) {
                        System.out.println("기기 통신사 선택");
                        System.out.println("1. SKT   2. KT   3. LG U+   4. 자급제");
                        System.out.printf("선택 : ");
                        carrier = scan.nextInt();
                        if (carrier == 1)
                            csc = "SKC";
                        else if (carrier == 2)
                            csc = "KTC";
                        else if (carrier == 3)
                            csc = "LUC";
                        else if (carrier == 4)
                            csc = "KOO";
                    }
                url = "http://doc.samsungmobile.com/" + model_final + "/" + csc + "/doc.html";
                try {
                    Document doc = Jsoup.connect(url).get();
                    Elements result = doc.select("[id=sel_lang_hidden] option");
                    list = result.eachText();
                    int i=0;
                    for(String s : list)
                    {
                        if (i>0)
                            break;
                        addedurl = s.substring(6, 36);
                        i++;
                    }
                } catch(IOException e) {
                    if (firsterror == 0) {
                        System.err.println("모델명을 잘못 입력하셨거나 미지원 기종입니다.");
                    }
                    error = 1;
                }
                urlfinal = "http://doc.samsungmobile.com/" + addedurl;
                while(error == 0) {
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------------------");
                    System.out.println("1. 최신 펌웨어 확인   2. 업데이트 후 다운그레이드 가능 여부 확인   3. 빌드 번호로 빌드 존재 여부 확인   4. 모델 변경   5. 종료");
                    System.out.println();
                    System.out.printf("원하시는 옵션을 선택해 주세요 : ");
                    input = scan.nextInt();
                    if (input == 1) {
                        try {
                            Document doc = Jsoup.connect(urlfinal).get();
                            Elements result = doc.select("[class=\"container\"] div div");
                            Elements result2 = doc.select("[class=\"container\"] div span");
                            Elements result3 = doc.select("[class=\"container\"] div h1 b");
                            list1 = result.eachText();
                            list2 = result2.eachText();
                            list3 = result3.eachText();
                            System.out.println("---------- 선택한 디바이스 정보 ----------");
                            System.out.printf("단말명 : ");
                            for (String s : list3) {
                                System.out.println(s);
                            }
                            System.out.println("모델명 : " + model_final);
                            if (csc.equals("SKC"))
                                System.out.println("통신사 : SKT");
                            else if (csc.equals("KTC"))
                                System.out.println("통신사 : KT");
                            else if (csc.equals("LUC"))
                                System.out.println("통신사 : LG U+");
                            else if (csc.equals("KOO"))
                                System.out.println("통신사 : 자급제");

                            System.out.println("---------- 최신 소프트웨어 정보 ----------");

                            int i = 0;
                            for (String s : list1) {
                                i++;
                                System.out.println(s);
                                if (i > 3) {
                                    break;
                                }
                            }
                            System.out.println();
                            int j = 0;
                            for (String s : list2) {
                                j++;
                                System.out.println(s);
                                if (j > 1) {
                                    break;
                                }
                            }
                        } catch (IOException e) {
                            System.err.println("일시적으로 서버와 통신을 할 수 없습니다. 나중에 다시 시도해 주세요.");
                            break;
                        }
                    } else if (input == 2) {
                        try {
                            Document doc = Jsoup.connect(urlfinal).get();
                            Elements result = doc.select("[class=\"container\"] div div");
                            list1 = result.eachText();
                        } catch (IOException e) {
                            System.err.println("미지원 기종입니다.");
                        }

                        int i = 0;
                        for (String s : list1) {
                            i++;
                            latest_build_number = s;
                            if (i > 0) {
                                break;
                            }
                        }
                        try {
                            System.out.printf("현재 업데이트 전의 빌드 번호를 입력해 주세요 (예 : G885SKSU3BSF1) : ");
                            user_build_number = scan.next();
                            latest_build_number = latest_build_number.substring(7, 20);
                            latest_build_number = latest_build_number.substring(8, 9);
                            user_build_number = user_build_number.substring(8, 9);
                            num_latest_build_number = Integer.parseInt(latest_build_number);
                            num_user_build_number = Integer.parseInt(user_build_number);
                            if (latest_build_number.equals(user_build_number)) {
                                System.out.println("최신 S/W 업데이트 후 원래 사용하던 버전으로 다운그레이드가 가능합니다.");
                            } else if (num_latest_build_number > num_user_build_number) {
                                System.out.println("최신 S/W 업데이트 후 원래 사용하던 버전으로 다운그레이드 할 수 없습니다.");
                            } else
                                System.out.println("현재 빌드 번호를 잘못 입력하셨습니다.");
                        } catch (StringIndexOutOfBoundsException s) {
                            System.err.println("현재 빌드 번호를 잘못 입력하셨습니다.");
                        }
                    } else if (input == 3) {
                        System.out.print("확인하실 펌웨어의 빌드 번호를 입력해 주세요 (예 : G885SKSU3BSF1) : ");
                        checkbuild = scan.next();
                        checkbuild = checkbuild.toUpperCase();
                        buildfound = 0;
                        try {
                            Document doc = Jsoup.connect(urlfinal).get();
                            Elements result = doc.select("[class=\"container\"] div div");
                            list1 = result.eachText();
                            for (String s : list1) {
                                if (s.contains(checkbuild) == true) {
                                    buildfound = 1;
                                    break;
                                }
                                else
                                    buildfound = 0;
                            }
                        } catch (IOException e) {
                            System.err.println("빌드 번호를 잘못 입력하셨습니다.");
                        }

                        if (buildfound == 1) {
                            System.out.println();
                            System.out.println("존재하는 빌드입니다.");
                            System.out.println();
                        }
                        else {
                            System.out.println();
                            System.out.println("존재하지 않는 빌드입니다.");
                            System.out.println();
                        }
                    }
                    else if (input == 4)
                    {
                        break;
                    }
                    else if (input == 5)
                        break;
                }
                if (input == 5) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            }
        }
    }