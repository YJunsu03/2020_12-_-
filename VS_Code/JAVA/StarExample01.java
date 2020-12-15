import java.util.Scanner;

public class StarExample01 {
    public static void main(String[] args) {
        System.out.print("별을 찍고 싶은 수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++) {
                
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
