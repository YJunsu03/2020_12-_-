package PROJECT.Character_List;

import java.util.Random;
import java.util.Scanner;

public class Evlin {
    static String Evlin = "이블린";
    static float EvlinAD = 90; // 공격력
    static int EvlinHP = 300; // 체력
    static int EvlinCri = 50; // 치명타 확률
    static int EvlinPS = 50; // 이블린 [패시브] 게임 시작 후 첫 턴 동안 은신 / 은신 중 데미지 50% 증가 
    static boolean Hide; // 은신 여부
    static String EvlinDC = "이블린은 마족중에서도 최상위권에 속하는 고위 마족입니다. 그녀의 날카로운 공격은 암살에 특화되어있습니다. ";// 캐릭터 설명
    static Random Evlinchp = new Random(); //랜덤 객체 생성(디폴트 시드값 : 현재시간)

    public static void main(String[] args) {

        int TraningTurn = 0;
        int tt = TraningTurn; // TraningTurn 이하 tt 라 칭한다.

        // Object TraningTurn = new Object();
        // Object tt = TraningTurn; // 앞으로 TraningTurn 을 부르고 싶을땐 짧은 tt 를 부르면 TraningTurn 을 부른것과 마찬가지가 된다.  
        // 하지만 타입이 int 같은 정수형을 잴 수 있는 타입이 아니기 때문에 턴제로는 알맞지 않은 변수 타입선언 이므로 이는 쓰지못한다.

        Evlinchp.setSeed(System.currentTimeMillis()); // 시드값 설정을 따로 둠
        Evlinchp.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("________________________");
        System.out.println("캐릭터 이름 : " + Evlin);
        System.out.println("공격력 : " + EvlinAD);
        System.out.println("체력 : " + EvlinHP);
        System.out.println("치명타 확률 : " + EvlinCri + "%");
        System.out.println("패시브 : 악마의 포옹(이블린은 게임 시작 후 첫 턴에 은신을 합니다. 은신중에는 공격을 할 수 없으며, 이블린이 은신상태 중 공격시 50% 추가 피해를 줍니다.) 이블린의 공격은 고귀한 천사의 방패마저 꿰뚫습니다.");
        System.out.println("________________________");

        System.out.print("SYSTEM :: 캐릭터를 체험해 보시겠습니까? (Y/N)");
        String Critest = sc.next();
        System.out.println("");

        if(Critest.equals("Y") || Critest.equals("y")) {
            System.out.println("SYSTEM :: 캐릭터 체험 프로그램을 실행합니다.");
            System.out.println("_______________________________________");

            if(tt==1) {
                System.out.println("이블린은 첫 턴 시작시 은신을 발동합니다.");
                System.out.println("이블린이 은신 중 공격시 적 에게 추가 피해를 입힙니다. (150%) ");
                Hide = true;
            }
            if(Hide == true) {
                EvlinAD = (float)(EvlinAD * 1.5);
            } 
            if(tt!=1) {
                Hide = false;
                EvlinAD = (float)(EvlinAD / 1.5);
            }
            
                    
                    
                while(true) {        
                        System.out.println("");

                        int EvlinCri = (int)(Math.random()*100);
                        if (EvlinCri < 50) {
                            System.out.println( "치명타! 데미지가 두배가 들어갑니다!");
                            System.out.println("");
                            System.out.println("적에게 입힌 데미지 : " + EvlinAD*2);
                        }
                        else {
                            System.out.println("치명타가 발생하지 않았습니다.");
                            System.out.println("적에게 입힌 데미지 : " + EvlinAD);
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
}