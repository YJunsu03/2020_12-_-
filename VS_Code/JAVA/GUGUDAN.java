import java.util.Scanner;

public class GUGUDAN {
    public static void main(String[] args) {
        int number=0;
        String YesNo;
        System.out.print("보고 싶은 구구단 숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        while(true) {
            if(number == 2) {
                System.out.println("----2단----");
                for(int i=2; i<=2; i++) {
                    for(int j=1; j<=9; j++) {
                        System.out.println(i + "x" + j + "=" + i*j);
                    }
                    System.out.println("");
                }
               
            }

            if(number == 3) {
              System.out.println("----3단----");
                for(int i=3; i<=3; i++) {
                    for(int j=1; j<=9; j++) {
                        System.out.println(i + "x" + j + "=" + i*j);
                    }
                    System.out.println("");
                }
            }

            if(number == 4) {
              System.out.println("----4단----");
                for(int i=4; i<=4; i++) {
                    for(int j=1; j<=9; j++) {
                        System.out.println(i + "x" + j + "=" + i*j);
                    }
                    System.out.println("");
                }
            }

            if(number == 5) {
                System.out.println("----5단----");
                  for(int i=5; i<=5; i++) {
                      for(int j=1; j<=9; j++) {
                          System.out.println(i + "x" + j + "=" + i*j);
                      }
                      System.out.println("");
                  }
            }

              if(number == 6) {
                System.out.println("----6단----");
                  for(int i=6; i<=6; i++) {
                      for(int j=1; j<=9; j++) {
                          System.out.println(i + "x" + j + "=" + i*j);
                      }
                      System.out.println("");
                  }
            }

              if(number == 7) {
                System.out.println("----7단----");
                  for(int i=7; i<=7; i++) {
                      for(int j=1; j<=9; j++) {
                          System.out.println(i + "x" + j + "=" + i*j);
                      }
                      System.out.println("");
                  }
            }

              if(number == 8) {
                System.out.println("----8단----");
                  for(int i=8; i<=8; i++) {
                      for(int j=1; j<=9; j++) {
                          System.out.println(i + "x" + j + "=" + i*j);
                      }
                      System.out.println("");
                  }
            }

              if(number == 9) {
                System.out.println("----9단----");
                  for(int i=9; i<=9; i++) {
                      for(int j=1; j<=9; j++) {
                          System.out.println(i + "x" + j + "=" + i*j);
                      }
                      System.out.println("");
                  }
            }
            System.out.println("구구단 프로그램을 종료하시겠습니까?");
            System.out.print("(Y/N)");
            Scanner yn = new Scanner(System.in);
            YesNo = yn.next();
            if(YesNo.equals("Y")) {
                break;
            } else if(YesNo.equals("Yes")) {
                break;                       
            } else if(YesNo.equals("No")) {
                continue;
            } else if(YesNo.equals("N")) {
                continue;
            }
        }

             
        }   
        
    }

