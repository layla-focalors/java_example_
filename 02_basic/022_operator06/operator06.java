
import java.util.*;

public class operator06 {
    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // 023_operator06 예제의 목표는 
        // 논리 연산자에 대한 이해 및 실습, SCE의 개념 파악을 위한 실습을 진행한다.
        // ------------------------------------------------------------------

        Scanner scn = new Scanner(System.in);

        System.out.print("정수 입력 >> ");
        int input_number = scn.nextInt();

        // 0 ~ 100 사이의 값 입력했는지 확인
        boolean result1 = input_number>=0 && input_number<=100;
        System.out.println("0과 100사이의 값인가? " + (input_number>=0 && input_number<=100));
        System.out.println("0과 100사이의 값인가? " + result1);

        // 0 ~ 100 사이의 값 입력했고 그것이 짝수인지 확인
        boolean result2 = input_number%2==0 && result1;
        System.out.println("짝수이고 0과 100사이의 값인가? " + result2);

        // 그러나 그 값이 200의 배수이면 true 처리 
        boolean result3 = result2 || input_number%200==0;
        System.out.println("짝수이고, 0과 100사이 값이거나 200의 배수인가? " + result3);

        // 문의 상태 체크(NOT 논리 연산의 활용)
        boolean door_state = false; // 문이 닫혀있습니다.
        System.out.println("문의 상태 : " + door_state);
        door_state = !door_state;
        System.out.println("문의 상태 : " + door_state);

        // Short Circuit Evaluation : 뒤 조건은 볼 필요도 없다!
        int left1=10, right1=20;
        System.out.println((++left1 == 11 || ++right1 == 21));
        // 좌변에서 이미 true이기 때문에 우변을 실행하지 않는다.
        System.out.println(left1); // 11
        System.out.println(right1); 
        // 21? 논리 연산의 앞 부분만 실행한 경우 | 20? 논리 연산의 뒷 부분은 실행하지 않은 경우

        int left2=10, right2=20;
        System.out.println((++left2 == 10415 && ++right2 == 21)); 
        // 좌변에서 이미 false이기 때문에 우변을 실행하지 않는다.
        System.out.println(left2); // 11
        System.out.println(right2); 
        // right2의 값이 21? 논리 연산의 앞 부분만 실행한 경우 | right2의 값이 20? 논리 연산의 뒷 부분은 실행하지 않은 경우

        return;
    }
    
}



