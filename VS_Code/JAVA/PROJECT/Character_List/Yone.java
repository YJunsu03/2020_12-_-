package PROJECT.Character_List;

import java.util.Random;
import java.util.Scanner;

public class Yone {
    static String Yone = "요네";
    static int YonefirstAD = 25; // 첫번째 검 공격력
    static int YonesecondAD = 25; // 두번째 검 공격력
    static int YoneHP = 500; // 체력
    static int YoneCri = 60; // 치명타 확률
    static String YoneDC; // 캐릭터 설명
    static Random Yonechp = new Random(); //랜덤 객체 생성(디폴트 시드값 : 현재시간)

    public static void main(String[] args) {
        Yonechp.setSeed(System.currentTimeMillis()); // 시드값 설정을 따로 둠
        Yonechp.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("________________________");
        System.out.println("캐릭터 이름 : " + Yone);
        System.out.println("공격력 : " + YonefirstAD + "," + YonesecondAD);
        System.out.println("체력 : " + YoneHP);
        System.out.println("치명타 확률 : " + YoneCri + "%");
        System.out.println("________________________");

        System.out.print("SYSTEM :: 캐릭터를 체험해 보시겠습니까? (Y/N)");
        String Critest = sc.next();
        System.out.println("");

        if(Critest.equals("Y") || Critest.equals("y")) {
            System.out.println("SYSTEM :: 캐릭터 체험 프로그램을 실행합니다.");
            System.out.println("_______________________________________");
            while(true) {
                int YoneCri = (int)(Math.random()*100);
                    if (YoneCri < 60) {
                        System.out.println( "치명타! 데미지가 두배가 들어갑니다!");
                        System.out.println("");
                        System.out.println("적에게 입힌 데미지 : " + (YonefirstAD*2 + YonesecondAD*2));
                    }
                    else {
                        System.out.println("치명타가 발생하지 않았습니다.");
                    }
                System.out.println("계속하시겠습니까? (Y/N)");
                String yn = sc.next();
                System.out.println("__________________________");
               
                    if(yn.equals("Y") || yn.equals("y")) {
                        continue;
                    }
                    else {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    }
            }
        }
    }
}