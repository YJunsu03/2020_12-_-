import java.util.Scanner;

public class GUGUDAN_Jaejun_ver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("구구단 입력: ");
            int num = sc.nextInt();

            System.out.println("---" + num + "단---" );

            for (int i = 1; i < 10; i++) {
                System.out.println(num + "*" + i + "=" + i * num);
            }
            System.out.println("구구단 프로그램을 종료하시겠습니까?");
            System.out.print("(Y/N)");
            String yn = sc.next();

            if (yn.equals("y")) {
                break;
            }
        }

    }
}
        

