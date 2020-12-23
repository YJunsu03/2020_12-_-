package PROJECT;

import java.util.Scanner;

public class pvpGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("SYSTEM : 신규 유저님이 서버에 접속하셨습니다.");
        System.out.print("환영합니다! 닉네임을 입력해주세요 : ");

        String PlayerName = sc.next();

        System.out.println("환영합니다! " + PlayerName + "님! 캐릭터 선택화면으로 이동합니다!");
        System.out.println();

   
    }
}
