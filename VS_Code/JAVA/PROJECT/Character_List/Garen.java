package PROJECT.Character_List;

import java.util.Random;
import java.util.Scanner;

public class Garen {
    static String Garen = "가렌";
    static int GarenAD = 30; // 공격력 
    static int GarenHP = 750; // 체력
    static int GarenCri = 30; // 치명타 확률
    static int GarenPS = 70; //가렌 [패시브] 3턴마다 받는 피해 70% 감소 
    static String GarenDC = "가렌은 강인한 신체와 정신력을 바탕으로 전장에서 선봉대 역할을 맡아 아군을 보호하는 든든한 캐릭터입니다."; // 캐릭터 설명
    static String type = "밸런스형"; // 캐릭터 타입
    static Random Garenchp = new Random(); //랜덤 객체 생성(디폴트 시드값 : 현재시간)

    public static void main(String[] args) {
        Garenchp.setSeed(System.currentTimeMillis()); // 시드값 설정을 따로 둠
        Garenchp.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("___________________________________________________________________________________________________");
        System.out.println("캐릭터 이름 : " + Garen);
        System.out.println("공격력 : " + GarenAD);
        System.out.println("체력 : " + GarenHP);
        System.out.println("치명타 확률 : " + GarenCri + "%");
        System.out.println("패시브 : 선봉장(매 3턴 마다 받는 피해 70% 감소) 가렌은 불굴의 의지로 전투시 선봉대 역할을 맡습니다.");
        System.out.println("캐릭터 설명 : " + GarenDC);
        System.out.println();
        System.out.println("___________________________________________________________________________________________________");

        System.out.print("SYSTEM :: 캐릭터를 체험해 보시겠습니까? (Y/N)");
        String Critest = sc.next();
        System.out.println("");

        if(Critest.equals("Y") || Critest.equals("y")) {
            System.out.println("SYSTEM :: 캐릭터 체험 프로그램을 실행합니다.");
            System.out.println("_______________________________________");
            while(true) {
                int GarenCri = (int)(Math.random()*100);
                    if (GarenCri < 30) {
                        System.out.println( "치명타! 데미지가 두배가 들어갑니다!");
                        System.out.println("");
                        System.out.println("적에게 입힌 데미지 : " + GarenAD*2);
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