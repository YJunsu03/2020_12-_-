package PROJECT.Character_List;

import java.util.Random;
import java.util.Scanner;

import PROJECT.pvpGame;

public class Ani {
    static String Ani = "애니";
    static int AniAD = 70; // 공격력
    static int AniHP = 400; // 체력
    static int AniCri = 25; // 치명타 확률
    static int AniPS = 5; //애니 [패시브] 공격한 적에게 5의 추가 지속 피해 2턴간 부여 (최대 3회 중첩가능 (EX : 세턴간 3번 공격 => 한턴에 추가뎀10씩 부여))
    // 애니의 패시브 스킬  
    static String AniDC = ""; // 캐릭터 설명
    static String type = "마법형"; // 캐릭터 타입
    static Random Anichp = new Random(); //랜덤 객체 생성(디폴트 시드값 : 현재시간)

    public static void main(String[] args) {
        Anichp.setSeed(System.currentTimeMillis()); // 시드값 설정을 따로 둠
        Anichp.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("______________________________________________________________________________________________________________________________________________");
        System.out.println("캐릭터 이름 : " + Ani);
        System.out.println("공격력 : " + AniAD);
        System.out.println("체력 : " + AniHP);
        System.out.println("치명타 확률 : " + AniCri + "%");
        System.out.println("패시브 : 홍염의 아이(애니가 공격을 입힌 적에게 3턴간 5의 추가 지속 피해 중첩 최대3회 가능 ) 그녀의 공격을 받은 사람이 살아있는걸 본 사람은 없습니다.");
        System.out.println("캐릭터 설명 : 지옥에서 태어난 홍염의 왕의 딸인 애니는 이세계로 추방당해 현재 이곳에 힘을 빌려주고 있는 중이다.");
        System.out.println("______________________________________________________________________________________________________________________________________________");

        System.out.print("SYSTEM :: 캐릭터를 체험해 보시겠습니까? (Y/N)");
        String Critest = sc.next();
        System.out.println("");

        if(Critest.equals("Y") || Critest.equals("y")) {
            System.out.println("SYSTEM :: 캐릭터 체험 프로그램을 실행합니다.");
            System.out.println("_______________________________________");
            while(true) {
                int AniCri = (int)(Math.random()*100);
                    if (AniCri < 25) {
                        System.out.println( "치명타! 데미지가 두배가 들어갑니다!");
                        System.out.println("");
                        System.out.println("적에게 입힌 데미지 : " + AniAD*2);
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