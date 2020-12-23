package PROJECT.Character_List;

import java.util.Random;
import java.util.Scanner;

import PROJECT.pvpGame;

public class Yasuo extends pvpGame {
    static String Yasuo = "야스오";
    static int YasuoAD = 45; // 공격력
    static int YasuoHP = 550; // 체력
    static int YasuoCri = 100; // 치명타 확률
    static int YasuoPS = 100; //야스오 [패시브] 치명타 확률 100% 치명타 데미지 20%감소 
    static String YasuoDC = "야스오의 날렵함과 바람의 검술을 따라올 자는 없습니다. 치명타 확률이 매우 높습니다. 그 대신 치명타 피해량이 낮습니다."; // 캐릭터 설명
    
    static String type = "공격형"; // 캐릭터 타입
    static Random Yasuochp = new Random(); //랜덤 객체 생성(디폴트 시드값 : 현재시간)

    public static void main(String[] args) {
        Yasuochp.setSeed(System.currentTimeMillis()); // 시드값 설정을 따로 둠
        Yasuochp.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("_______________________________________________________________________________________________________");
        System.out.println("캐릭터 이름 : " + Yasuo);
        System.out.println("공격력 : " + YasuoAD);
        System.out.println("체력 : " + YasuoHP);
        System.out.println("치명타 확률 : " + YasuoCri + "%");
        System.out.println("패시브 : 돌풍(치명타 확률 100%, 치명타 데미지 80%로 감소) 바람과 검을 하나로 만든 그의 검술은 이윽고 바람.");
        System.out.println("캐릭터 설명 : " + YasuoDC);
        System.out.println("_______________________________________________________________________________________________________");

        System.out.print("SYSTEM :: 캐릭터를 체험해 보시겠습니까? (Y/N)");
        String Critest = sc.next();
        System.out.println("");

        if(Critest.equals("Y") || Critest.equals("y")) {
            System.out.println("SYSTEM :: 캐릭터 체험 프로그램을 실행합니다.");
            System.out.println("_______________________________________");
            while(true) {
                int YasuoCri = (int)(Math.random()*100);
                    if (YasuoCri < 100) {
                        System.out.println("※ 야스오는 바람의 검사이므로 언제나 치명타가 발동합니다.");
                        System.out.println("");
                        System.out.println("적에게 입힌 데미지 : " + YasuoAD*1.8);
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