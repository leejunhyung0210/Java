package org.dimigo.exception;

import java.io.*;

public class basicexception {
    public static void main(String[] args) {
        try {
            uncheckedexception(null);
            checkedexception();

            String id = null;
            validate(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validate(String id) throws Exception {
        //try {
        if (id == null || "".equals(id)) {
            Exception e = new Exception("id를 입력하세요");
            throw e;
        }
        if (id.length() < 8) {
            throw new Exception("8자 이상 입력하세요");
        }
    }
//    }catch(Exception e) {
//        System.out.println(e.getMessage());
//        }
//}

    private static void uncheckedexception(String s) {
        try {
            //System.out.println(s.length());
            System.out.println(Integer.parseInt("1234"));
        } catch (NullPointerException npe) {
            System.out.println("문자열이 입력되지 않았습니다.");
            npe.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.println("숫자를 입력하세요.");
        } catch (Exception e) {
            System.out.println("알 수 없는 오류 발생");
        }
    }

    private static void checkedexception() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("inpux.txt"));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (FileNotFoundException fne) {
            System.out.println("파일이 없습니다.");
        } catch (IOException ie) {
            System.out.println("파일 읽기 중 오류");
        }
    }
}
