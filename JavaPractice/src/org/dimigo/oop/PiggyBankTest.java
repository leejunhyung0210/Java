package org.dimigo.oop;

public class PiggyBankTest {
    public static void main(String[] args) {
        System.out.println();
        FamilyMember[] Familymember = {
        new FamilyMember("아빠"), new FamilyMember("엄마"), new FamilyMember("나"), new FamilyMember("남동생")};
        FamilyMember.printMemberCnt();
        PiggyBank.putMoney("아빠", 10000);
        PiggyBank.putMoney("엄마", 5000);
        PiggyBank.putMoney("나", 2000);
        PiggyBank.putMoney("남동생", 1000);
        PiggyBank.printBalance();
        PiggyBank.putMoney("나", 1000);
        PiggyBank.printBalance();
    }
}

class FamilyMember {
    private static int memberCnt;
    private String memberName;

    public FamilyMember(String memberName)
    {
        memberCnt++;
        this.memberName = memberName;
    }

    public String getMemberName() {
        return memberName;
    }

    public static void printMemberCnt() {

        System.out.println("가족 총 인원 수 : " + memberCnt + "명");
    }
}

class PiggyBank {
    private static int balance = 0;

    public static void putMoney(String FamilyMember, int amount)
    {
        System.out.printf(FamilyMember + " : %,d원 넣음", amount);
        balance = balance + amount;
        System.out.println();
    }

    public static void printBalance() {
        System.out.printf("돼지저금통 총 금액 : %,d원", balance);
        System.out.println();
    }
}