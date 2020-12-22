import java.util.Scanner;

public class euler_2 {

    public static int fibonacci (int number) {
        int one=1, two=1, result=-1;
        // result 값을 -1로 초기화. 양의 정수가 아닌 수들은 if, else if 에 걸리지 않고
        // else 문에서도 for문 반복조건에 해당되지 않기 때문에 그대로 -1 이 나오게 됨.
        if(number == 1) {
            return one; // a1 = 1
        }
        else if (number == 2) {
            return two; // a2 = 1
        }
        else {
            for (int i = 2; i<number; i++) {
                result = one + two;
                one = two;          // 기존 two 가 새로운 one 이 되고
                two = result;       // 기존 result 가 새로운 two 가 된다.
            }
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in = sc.nextInt();
        System.out.println("피보나치 수열의 " + in + "번째 원소는 " + fibonacci(in) + "입니다.");
    }
}
