import java.util.Scanner;

public class GUGUDAN {
    public static void main(String[] args) {
        int number=0;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        switch(number) {
            case 2 : 
                System.out.println("----2단----");
                for(int i=2; i<=2; i++) {
                    for(int j=1; j<=9; j++) {
                        System.out.print("|  " + i + "x" + j + "=" + i*j);

                        if(i <= 4) {
                        System.out.print("  |");
                            if(i > 4) {
                                System.out.println(" |");
                            }
                        }
                    }
                    System.out.println("");
                }
                System.out.println("______");
            break;
            case 3 : 
                for(int i=3; i<=9; i++) {
                    for(int j=1; j<i; j++) {
                        System.out.println("\n");
                    }
                }
            break;
        }
    }
}
