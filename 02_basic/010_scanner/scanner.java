
import java.util.*;

public class scanner {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 010_scanner 예제의 목표는
        // Scanner 클래스를 사용하여 표준 입력으로 자료형 별로 값을 입력받는 실습한다.
        // ------------------------------------------------------------------

        Scanner scn = new Scanner(System.in);

        System.out.print("문장 입력 >> ");
        String input_string = scn.nextLine(); // 문장을 입력 받는다.
        System.out.printf("입력 내용 : " + "%s \n", input_string);

        System.out.print("정수 입력 >> ");
        int input_number = scn.nextInt(); // 정수를 입력 받는다.
        System.out.printf("입력 내용 : " + "%d \n", input_number);

        System.out.print("실수 입력 >> ");
        double input_fnumber = scn.nextDouble(); // 실수를 입력 받는다.
        System.out.printf("입력 내용 : " + "%f \n", input_fnumber);

        return;
    }
}



